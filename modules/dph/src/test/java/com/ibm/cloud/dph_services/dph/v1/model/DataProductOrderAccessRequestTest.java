/*
 * (C) Copyright IBM Corp. 2025.
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

import com.ibm.cloud.dph_services.dph.v1.model.DataProductCustomWorkflowDefinition;
import com.ibm.cloud.dph_services.dph.v1.model.DataProductOrderAccessRequest;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataProductOrderAccessRequest model.
 */
public class DataProductOrderAccessRequestTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataProductOrderAccessRequest() throws Throwable {
    DataProductCustomWorkflowDefinition dataProductCustomWorkflowDefinitionModel = new DataProductCustomWorkflowDefinition.Builder()
      .id("18bdbde1-918e-4ecf-aa23-6727bf319e14")
      .build();
    assertEquals(dataProductCustomWorkflowDefinitionModel.id(), "18bdbde1-918e-4ecf-aa23-6727bf319e14");

    DataProductOrderAccessRequest dataProductOrderAccessRequestModel = new DataProductOrderAccessRequest.Builder()
      .taskAssigneeUsers(java.util.Arrays.asList("testString"))
      .preApprovedUsers(java.util.Arrays.asList("testString"))
      .customWorkflowDefinition(dataProductCustomWorkflowDefinitionModel)
      .build();
    assertEquals(dataProductOrderAccessRequestModel.taskAssigneeUsers(), java.util.Arrays.asList("testString"));
    assertEquals(dataProductOrderAccessRequestModel.preApprovedUsers(), java.util.Arrays.asList("testString"));
    assertEquals(dataProductOrderAccessRequestModel.customWorkflowDefinition(), dataProductCustomWorkflowDefinitionModel);

    String json = TestUtilities.serialize(dataProductOrderAccessRequestModel);

    DataProductOrderAccessRequest dataProductOrderAccessRequestModelNew = TestUtilities.deserialize(json, DataProductOrderAccessRequest.class);
    assertTrue(dataProductOrderAccessRequestModelNew instanceof DataProductOrderAccessRequest);
    assertEquals(dataProductOrderAccessRequestModelNew.customWorkflowDefinition().toString(), dataProductCustomWorkflowDefinitionModel.toString());
  }
}