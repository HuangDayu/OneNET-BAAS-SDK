/*
 * 轻应用Baas平台API
 * demo
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.chinamobile.iot.baas.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CustomPermission
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-26T17:00:09.998+08:00")
public class CustomPermission {
  @SerializedName("customPermissionDesc")
  private String customPermissionDesc = null;

  @SerializedName("customPermissionId")
  private Integer customPermissionId = null;

  @SerializedName("customPermissionName")
  private String customPermissionName = null;

  public CustomPermission customPermissionDesc(String customPermissionDesc) {
    this.customPermissionDesc = customPermissionDesc;
    return this;
  }

   /**
   * Get customPermissionDesc
   * @return customPermissionDesc
  **/
  @ApiModelProperty(value = "")
  public String getCustomPermissionDesc() {
    return customPermissionDesc;
  }

  public void setCustomPermissionDesc(String customPermissionDesc) {
    this.customPermissionDesc = customPermissionDesc;
  }

  public CustomPermission customPermissionId(Integer customPermissionId) {
    this.customPermissionId = customPermissionId;
    return this;
  }

   /**
   * Get customPermissionId
   * @return customPermissionId
  **/
  @ApiModelProperty(value = "")
  public Integer getCustomPermissionId() {
    return customPermissionId;
  }

  public void setCustomPermissionId(Integer customPermissionId) {
    this.customPermissionId = customPermissionId;
  }

  public CustomPermission customPermissionName(String customPermissionName) {
    this.customPermissionName = customPermissionName;
    return this;
  }

   /**
   * Get customPermissionName
   * @return customPermissionName
  **/
  @ApiModelProperty(value = "")
  public String getCustomPermissionName() {
    return customPermissionName;
  }

  public void setCustomPermissionName(String customPermissionName) {
    this.customPermissionName = customPermissionName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomPermission customPermission = (CustomPermission) o;
    return Objects.equals(this.customPermissionDesc, customPermission.customPermissionDesc) &&
        Objects.equals(this.customPermissionId, customPermission.customPermissionId) &&
        Objects.equals(this.customPermissionName, customPermission.customPermissionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customPermissionDesc, customPermissionId, customPermissionName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomPermission {\n");
    
    sb.append("    customPermissionDesc: ").append(toIndentedString(customPermissionDesc)).append("\n");
    sb.append("    customPermissionId: ").append(toIndentedString(customPermissionId)).append("\n");
    sb.append("    customPermissionName: ").append(toIndentedString(customPermissionName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

