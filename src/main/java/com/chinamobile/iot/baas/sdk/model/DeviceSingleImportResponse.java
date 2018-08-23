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
 * 单条导入设备响应
 */
@ApiModel(description = "单条导入设备响应")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-26T17:00:09.998+08:00")
public class DeviceSingleImportResponse {
  @SerializedName("apiKey")
  private String apiKey = null;

  @SerializedName("deviceId")
  private String deviceId = null;

  public DeviceSingleImportResponse apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

   /**
   * 设备apiKey
   * @return apiKey
  **/
  @ApiModelProperty(value = "设备apiKey")
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public DeviceSingleImportResponse deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * 设备id
   * @return deviceId
  **/
  @ApiModelProperty(value = "设备id")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceSingleImportResponse deviceSingleImportResponse = (DeviceSingleImportResponse) o;
    return Objects.equals(this.apiKey, deviceSingleImportResponse.apiKey) &&
        Objects.equals(this.deviceId, deviceSingleImportResponse.deviceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, deviceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceSingleImportResponse {\n");
    
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
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

