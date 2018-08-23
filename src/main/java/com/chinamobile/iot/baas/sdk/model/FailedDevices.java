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
 * 批量导入设备失败信息
 */
@ApiModel(description = "批量导入设备失败信息")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-26T17:00:09.998+08:00")
public class FailedDevices {
  @SerializedName("deviceId")
  private String deviceId = null;

  @SerializedName("deviceName")
  private String deviceName = null;

  @SerializedName("msg")
  private String msg = null;

  public FailedDevices deviceId(String deviceId) {
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

  public FailedDevices deviceName(String deviceName) {
    this.deviceName = deviceName;
    return this;
  }

   /**
   * 设备名称
   * @return deviceName
  **/
  @ApiModelProperty(value = "设备名称")
  public String getDeviceName() {
    return deviceName;
  }

  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }

  public FailedDevices msg(String msg) {
    this.msg = msg;
    return this;
  }

   /**
   * 导入失败原因
   * @return msg
  **/
  @ApiModelProperty(value = "导入失败原因")
  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailedDevices failedDevices = (FailedDevices) o;
    return Objects.equals(this.deviceId, failedDevices.deviceId) &&
        Objects.equals(this.deviceName, failedDevices.deviceName) &&
        Objects.equals(this.msg, failedDevices.msg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, deviceName, msg);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailedDevices {\n");
    
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
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
