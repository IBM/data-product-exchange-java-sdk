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
import com.ibm.cloud.dph_services.dph.v1.model.DataProductDomain;
import com.ibm.cloud.dph_services.dph.v1.model.ErrorExtraResource;
import com.ibm.cloud.dph_services.dph.v1.model.ErrorModelResource;
import com.ibm.cloud.dph_services.dph.v1.model.InitializeSubDomain;
import com.ibm.cloud.dph_services.dph.v1.model.MemberRolesSchema;
import com.ibm.cloud.dph_services.dph.v1.model.PropertiesSchema;
import com.ibm.cloud.dph_services.dph.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataProductDomain model.
 */
public class DataProductDomainTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataProductDomain() throws Throwable {
    ContainerReference containerReferenceModel = new ContainerReference.Builder()
      .id("d29c42eb-7100-4b7a-8257-c196dbcca1cd")
      .type("catalog")
      .build();
    assertEquals(containerReferenceModel.id(), "d29c42eb-7100-4b7a-8257-c196dbcca1cd");
    assertEquals(containerReferenceModel.type(), "catalog");

    ErrorExtraResource errorExtraResourceModel = new ErrorExtraResource.Builder()
      .id("testString")
      .timestamp(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
      .environmentName("testString")
      .httpStatus(Long.valueOf("0"))
      .sourceCluster(Long.valueOf("0"))
      .sourceComponent(Long.valueOf("0"))
      .transactionId(Long.valueOf("0"))
      .build();
    assertEquals(errorExtraResourceModel.id(), "testString");
    assertEquals(errorExtraResourceModel.timestamp(), DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"));
    assertEquals(errorExtraResourceModel.environmentName(), "testString");
    assertEquals(errorExtraResourceModel.httpStatus(), Long.valueOf("0"));
    assertEquals(errorExtraResourceModel.sourceCluster(), Long.valueOf("0"));
    assertEquals(errorExtraResourceModel.sourceComponent(), Long.valueOf("0"));
    assertEquals(errorExtraResourceModel.transactionId(), Long.valueOf("0"));

    ErrorModelResource errorModelResourceModel = new ErrorModelResource.Builder()
      .code("request_body_error")
      .message("testString")
      .extra(errorExtraResourceModel)
      .moreInfo("testString")
      .build();
    assertEquals(errorModelResourceModel.code(), "request_body_error");
    assertEquals(errorModelResourceModel.message(), "testString");
    assertEquals(errorModelResourceModel.extra(), errorExtraResourceModel);
    assertEquals(errorModelResourceModel.moreInfo(), "testString");

    MemberRolesSchema memberRolesSchemaModel = new MemberRolesSchema.Builder()
      .userIamId("testString")
      .roles(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(memberRolesSchemaModel.userIamId(), "testString");
    assertEquals(memberRolesSchemaModel.roles(), java.util.Arrays.asList("testString"));

    PropertiesSchema propertiesSchemaModel = new PropertiesSchema.Builder()
      .value("testString")
      .build();
    assertEquals(propertiesSchemaModel.value(), "testString");

    InitializeSubDomain initializeSubDomainModel = new InitializeSubDomain.Builder()
      .name("Operations")
      .id("testString")
      .description("testString")
      .build();
    assertEquals(initializeSubDomainModel.name(), "Operations");
    assertEquals(initializeSubDomainModel.id(), "testString");
    assertEquals(initializeSubDomainModel.description(), "testString");

    DataProductDomain dataProductDomainModel = new DataProductDomain.Builder()
      .container(containerReferenceModel)
      .trace("testString")
      .errors(java.util.Arrays.asList(errorModelResourceModel))
      .name("Operations")
      .description("This is a description of the data product domain.")
      .id("testString")
      .memberRoles(memberRolesSchemaModel)
      .xProperties(propertiesSchemaModel)
      .subDomains(java.util.Arrays.asList(initializeSubDomainModel))
      .build();
    assertEquals(dataProductDomainModel.container(), containerReferenceModel);
    assertEquals(dataProductDomainModel.trace(), "testString");
    assertEquals(dataProductDomainModel.errors(), java.util.Arrays.asList(errorModelResourceModel));
    assertEquals(dataProductDomainModel.name(), "Operations");
    assertEquals(dataProductDomainModel.description(), "This is a description of the data product domain.");
    assertEquals(dataProductDomainModel.id(), "testString");
    assertEquals(dataProductDomainModel.memberRoles(), memberRolesSchemaModel);
    assertEquals(dataProductDomainModel.xProperties(), propertiesSchemaModel);
    assertEquals(dataProductDomainModel.subDomains(), java.util.Arrays.asList(initializeSubDomainModel));

    String json = TestUtilities.serialize(dataProductDomainModel);

    DataProductDomain dataProductDomainModelNew = TestUtilities.deserialize(json, DataProductDomain.class);
    assertTrue(dataProductDomainModelNew instanceof DataProductDomain);
    assertEquals(dataProductDomainModelNew.container().toString(), containerReferenceModel.toString());
    assertEquals(dataProductDomainModelNew.trace(), "testString");
    assertEquals(dataProductDomainModelNew.name(), "Operations");
    assertEquals(dataProductDomainModelNew.description(), "This is a description of the data product domain.");
    assertEquals(dataProductDomainModelNew.id(), "testString");
    assertEquals(dataProductDomainModelNew.memberRoles().toString(), memberRolesSchemaModel.toString());
    assertEquals(dataProductDomainModelNew.xProperties().toString(), propertiesSchemaModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataProductDomainError() throws Throwable {
    new DataProductDomain.Builder().build();
  }

}