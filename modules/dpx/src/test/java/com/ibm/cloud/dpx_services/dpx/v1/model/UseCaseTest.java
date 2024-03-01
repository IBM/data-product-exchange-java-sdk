/*
 * (C) Copyright IBM Corp. 2024.
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

package com.ibm.cloud.dpx_services.dpx.v1.model;

import com.ibm.cloud.dpx_services.dpx.v1.model.ContainerReference;
import com.ibm.cloud.dpx_services.dpx.v1.model.UseCase;
import com.ibm.cloud.dpx_services.dpx.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UseCase model.
 */
public class UseCaseTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUseCase() throws Throwable {
    ContainerReference containerReferenceModel = new ContainerReference.Builder()
      .id("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
      .type("catalog")
      .build();
    assertEquals(containerReferenceModel.id(), "d29c42eb-7100-4b7a-8257-c196dbcca1cd");
    assertEquals(containerReferenceModel.type(), "catalog");

    UseCase useCaseModel = new UseCase.Builder()
      .id("testString")
      .name("testString")
      .container(containerReferenceModel)
      .build();
    assertEquals(useCaseModel.id(), "testString");
    assertEquals(useCaseModel.name(), "testString");
    assertEquals(useCaseModel.container(), containerReferenceModel);

    String json = TestUtilities.serialize(useCaseModel);

    UseCase useCaseModelNew = TestUtilities.deserialize(json, UseCase.class);
    assertTrue(useCaseModelNew instanceof UseCase);
    assertEquals(useCaseModelNew.id(), "testString");
    assertEquals(useCaseModelNew.name(), "testString");
    assertEquals(useCaseModelNew.container().toString(), containerReferenceModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUseCaseError() throws Throwable {
    new UseCase.Builder().build();
  }

}