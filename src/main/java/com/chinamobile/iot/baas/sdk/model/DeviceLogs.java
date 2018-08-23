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
import java.util.Date;

/**
 * DeviceLogs
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-26T17:00:09.998+08:00")
public class DeviceLogs {
  @SerializedName("createDate")
  private Date createDate = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("deviceId")
  private String deviceId = null;

  @SerializedName("deviceName")
  private String deviceName = null;

  @SerializedName("logId")
  private Long logId = null;

  @SerializedName("logType")
  private Integer logType = null;

  @SerializedName("operator")
  private Integer operator = null;

  public DeviceLogs createDate(Date createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(value = "")
  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  public DeviceLogs desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * Get desc
   * @return desc
  **/
  @ApiModelProperty(value = "")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public DeviceLogs deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Get deviceId
   * @return deviceId
  **/
  @ApiModelProperty(value = "")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public DeviceLogs deviceName(String deviceName) {
    this.deviceName = deviceName;
    return this;
  }

   /**
   * Get deviceName
   * @return deviceName
  **/
  @ApiModelProperty(value = "")
  public String getDeviceName() {
    return deviceName;
  }

  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }

  public DeviceLogs logId(Long logId) {
    this.logId = logId;
    return this;
  }

   /**
   * Get logId
   * @return logId
  **/
  @ApiModelProperty(value = "")
  public Long getLogId() {
    return logId;
  }

  public void setLogId(Long logId) {
    this.logId = logId;
  }

  public DeviceLogs logType(Integer logType) {
    this.logType = logType;
    return this;
  }

   /**
   * Get logType
   * @return logType
  **/
  @ApiModelProperty(value = "")
  public Integer getLogType() {
    return logType;
  }

  public void setLogType(Integer logType) {
    this.logType = logType;
  }

  public DeviceLogs operator(Integer operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  @ApiModelProperty(value = "")
  public Integer getOperator() {
    return operator;
  }

  public void setOperator(Integer operator) {
    this.operator = operator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceLogs deviceLogs = (DeviceLogs) o;
    return Objects.equals(this.createDate, deviceLogs.createDate) &&
        Objects.equals(this.desc, deviceLogs.desc) &&
        Objects.equals(this.deviceId, deviceLogs.deviceId) &&
        Objects.equals(this.deviceName, deviceLogs.deviceName) &&
        Objects.equals(this.logId, deviceLogs.logId) &&
        Objects.equals(this.logType, deviceLogs.logType) &&
        Objects.equals(this.operator, deviceLogs.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createDate, desc, deviceId, deviceName, logId, logType, operator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceLogs {\n");
    
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
    sb.append("    logType: ").append(toIndentedString(logType)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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

