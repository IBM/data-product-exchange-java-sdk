/*
 * (C) Copyright IBM Corp. 2026.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.dph_services.dph.v1.model;

import com.ibm.cloud.dph_services.dph.v1.model.DQCheckResult;
import com.ibm.cloud.dph_services.dph.v1.model.DQConnection;
import com.ibm.cloud.dph_services.dph.v1.model.DQContract;
import com.ibm.cloud.dph_services.dph.v1.model.DQDataset;
import com.ibm.cloud.dph_services.dph.v1.model.DQLogEntry;
import com.ibm.cloud.dph_services.dph.v1.model.DQRule;
import com.ibm.cloud.dph_services.dph.v1.model.DQServerMapping;
import com.ibm.cloud.dph_services.dph.v1.model.DataContractDQTestResult;
import com.ibm.cloud.dph_services.dph.v1.model.ErrorMessage;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataContractDQTestResult model.
 */
public class DataContractDQTestResultTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataContractDQTestResult() throws Throwable {
    DataContractDQTestResult dataContractDqTestResultModel = new DataContractDQTestResult();
    assertNull(dataContractDqTestResultModel.getTestRunId());
    assertNull(dataContractDqTestResultModel.getStatus());
    assertNull(dataContractDqTestResultModel.getDataContractId());
    assertNull(dataContractDqTestResultModel.getDataContractName());
    assertNull(dataContractDqTestResultModel.getDataContractVersion());
    assertNull(dataContractDqTestResultModel.getStartTime());
    assertNull(dataContractDqTestResultModel.getRunBy());
    assertNull(dataContractDqTestResultModel.getMessage());
    assertNull(dataContractDqTestResultModel.getErrorMessages());
    assertNull(dataContractDqTestResultModel.getContract());
    assertNull(dataContractDqTestResultModel.getServerMappings());
    assertNull(dataContractDqTestResultModel.getDataProduct());
    assertNull(dataContractDqTestResultModel.getStart());
    assertNull(dataContractDqTestResultModel.getEnd());
    assertNull(dataContractDqTestResultModel.getLogs());
    assertNull(dataContractDqTestResultModel.getCheckResults());
  }
}