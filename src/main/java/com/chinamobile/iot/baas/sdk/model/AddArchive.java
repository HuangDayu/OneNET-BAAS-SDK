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
 * 添加设备档案请求
 */
@ApiModel(description = "添加设备档案请求")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-26T17:00:09.998+08:00")
public class AddArchive {
  @SerializedName("archiveName")
  private String archiveName = null;

  @SerializedName("data")
  private Object data = null;

  @SerializedName("deviceId")
  private String deviceId = null;

  public AddArchive archiveName(String archiveName) {
    this.archiveName = archiveName;
    return this;
  }

   /**
   * 档案类型
   * @return archiveName
  **/
  @ApiModelProperty(value = "档案类型")
  public String getArchiveName() {
    return archiveName;
  }

  public void setArchiveName(String archiveName) {
    this.archiveName = archiveName;
  }

  public AddArchive data(Object data) {
    this.data = data;
    return this;
  }

   /**
   * 档案数据
   * @return data
  **/
  @ApiModelProperty(value = "档案数据")
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public AddArchive deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * 设备ID
   * @return deviceId
  **/
  @ApiModelProperty(value = "设备ID")
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
    AddArchive addArchive = (AddArchive) o;
    return Objects.equals(this.archiveName, addArchive.archiveName) &&
        Objects.equals(this.data, addArchive.data) &&
        Objects.equals(this.deviceId, addArchive.deviceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archiveName, data, deviceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddArchive {\n");
    
    sb.append("    archiveName: ").append(toIndentedString(archiveName)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

