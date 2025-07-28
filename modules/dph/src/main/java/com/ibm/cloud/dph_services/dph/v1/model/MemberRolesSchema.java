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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Member roles of a corresponding asset.
 */
public class MemberRolesSchema extends GenericModel {

  @SerializedName("user_iam_id")
  protected String userIamId;
  protected List<String> roles;

  /**
   * Builder.
   */
  public static class Builder {
    private String userIamId;
    private List<String> roles;

    /**
     * Instantiates a new Builder from an existing MemberRolesSchema instance.
     *
     * @param memberRolesSchema the instance to initialize the Builder with
     */
    private Builder(MemberRolesSchema memberRolesSchema) {
      this.userIamId = memberRolesSchema.userIamId;
      this.roles = memberRolesSchema.roles;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a MemberRolesSchema.
     *
     * @return the new MemberRolesSchema instance
     */
    public MemberRolesSchema build() {
      return new MemberRolesSchema(this);
    }

    /**
     * Adds a new element to roles.
     *
     * @param roles the new element to be added
     * @return the MemberRolesSchema builder
     */
    public Builder addRoles(String roles) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(roles,
        "roles cannot be null");
      if (this.roles == null) {
        this.roles = new ArrayList<String>();
      }
      this.roles.add(roles);
      return this;
    }

    /**
     * Set the userIamId.
     *
     * @param userIamId the userIamId
     * @return the MemberRolesSchema builder
     */
    public Builder userIamId(String userIamId) {
      this.userIamId = userIamId;
      return this;
    }

    /**
     * Set the roles.
     * Existing roles will be replaced.
     *
     * @param roles the roles
     * @return the MemberRolesSchema builder
     */
    public Builder roles(List<String> roles) {
      this.roles = roles;
      return this;
    }
  }

  protected MemberRolesSchema() { }

  protected MemberRolesSchema(Builder builder) {
    userIamId = builder.userIamId;
    roles = builder.roles;
  }

  /**
   * New builder.
   *
   * @return a MemberRolesSchema builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the userIamId.
   *
   * User id.
   *
   * @return the userIamId
   */
  public String userIamId() {
    return userIamId;
  }

  /**
   * Gets the roles.
   *
   * Roles of the given user.
   *
   * @return the roles
   */
  public List<String> roles() {
    return roles;
  }
}

