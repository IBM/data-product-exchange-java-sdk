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

import com.ibm.cloud.dph_services.dph.v1.model.ContainerReference;
import com.ibm.cloud.dph_services.dph.v1.model.Domain;
import com.ibm.cloud.dph_services.dph.v1.model.Overview;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Overview model.
 */
public class OverviewTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testOverview() throws Throwable {
    ContainerReference containerReferenceModel = new ContainerReference.Builder()
      .id("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
      .type("catalog")
      .build();
    assertEquals(containerReferenceModel.id(), "d29c42eb-7100-4b7a-8257-c196dbcca1cd");
    assertEquals(containerReferenceModel.type(), "catalog");

    Domain domainModel = new Domain.Builder()
      .id("testString")
      .name("testString")
      .container(containerReferenceModel)
      .build();
    assertEquals(domainModel.id(), "testString");
    assertEquals(domainModel.name(), "testString");
    assertEquals(domainModel.container(), containerReferenceModel);

    Overview overviewModel = new Overview.Builder()
      .apiVersion("v3.0.1")
      .kind("DataContract")
      .name("Sample Data Contract")
      .version("0.0.0")
      .domain(domainModel)
      .moreInfo("List of links to sources that provide more details on the data contract.")
      .build();
    assertEquals(overviewModel.apiVersion(), "v3.0.1");
    assertEquals(overviewModel.kind(), "DataContract");
    assertEquals(overviewModel.name(), "Sample Data Contract");
    assertEquals(overviewModel.version(), "0.0.0");
    assertEquals(overviewModel.domain(), domainModel);
    assertEquals(overviewModel.moreInfo(), "List of links to sources that provide more details on the data contract.");

    String json = TestUtilities.serialize(overviewModel);

    Overview overviewModelNew = TestUtilities.deserialize(json, Overview.class);
    assertTrue(overviewModelNew instanceof Overview);
    assertEquals(overviewModelNew.apiVersion(), "v3.0.1");
    assertEquals(overviewModelNew.kind(), "DataContract");
    assertEquals(overviewModelNew.name(), "Sample Data Contract");
    assertEquals(overviewModelNew.version(), "0.0.0");
    assertEquals(overviewModelNew.domain().toString(), domainModel.toString());
    assertEquals(overviewModelNew.moreInfo(), "List of links to sources that provide more details on the data contract.");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testOverviewError() throws Throwable {
    new Overview.Builder().build();
  }

}