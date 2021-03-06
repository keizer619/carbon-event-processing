/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.carbon.event.simulator.core;

import org.apache.axis2.AxisFault;
import org.apache.axis2.engine.AxisConfiguration;
import org.json.JSONObject;
import org.wso2.carbon.databridge.commons.StreamDefinition;

import java.util.Collection;
import java.util.List;

public interface EventSimulator {

    public Collection<StreamDefinition> getAllEventStreamDefinitions();

    public void sendEvent(Event eventDetail)throws AxisFault;

    public List<CSVFileInfo> getAllCSVFileInfo();

    public void sendEvents(String fileName)throws AxisFault;

    public void uploadService(UploadedFileItem[] fileItems,AxisConfiguration axisConfiguration)throws AxisFault;

    public String createTableAndAttributeMappingInfo(String fileName)throws AxisFault;

    public void createConfigurationXML(String fileName,String streamId,String separateChar, long eventSendingDelay,
                                       AxisConfiguration axisConfiguration);

    public void deleteFile(String fileName,AxisConfiguration axisConfiguration)throws AxisFault;

    public List<DataSourceTableAndStreamInfo> getAllDataSourceInfo();

    public void sendEventsViaDB(JSONObject allInfo, String preparedSelectStatement) throws AxisFault;

    public void createConfigurationXMLForDataSource(String dataSourceConfigAndEventStreamInfo,AxisConfiguration axisConfiguration) throws AxisFault;

    public void deleteDBConfigFile(String fileName,AxisConfiguration axisConfiguration)throws AxisFault;


}
