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
 * DeviceDelegationsDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-26T17:00:09.998+08:00")
public class DeviceDelegationsDTO {
  @SerializedName("delegateDate")
  private Date delegateDate = null;

  @SerializedName("delegateId")
  private Integer delegateId = null;

  @SerializedName("delegateLevel")
  private Integer delegateLevel = null;

  @SerializedName("deviceId")
  private String deviceId = null;

  @SerializedName("fromUserLoginName")
  private String fromUserLoginName = null;

  @SerializedName("fromUserUserName")
  private String fromUserUserName = null;

  @SerializedName("toUserLoginName")
  private String toUserLoginName = null;

  @SerializedName("toUserUserName")
  private String toUserUserName = null;

  public DeviceDelegationsDTO delegateDate(Date delegateDate) {
    this.delegateDate = delegateDate;
    return this;
  }

   /**
   * Get delegateDate
   * @return delegateDate
  **/
  @ApiModelProperty(value = "")
  public Date getDelegateDate() {
    return delegateDate;
  }

  public void setDelegateDate(Date delegateDate) {
    this.delegateDate = delegateDate;
  }

  public DeviceDelegationsDTO delegateId(Integer delegateId) {
    this.delegateId = delegateId;
    return this;
  }

   /**
   * Get delegateId
   * @return delegateId
  **/
  @ApiModelProperty(value = "")
  public Integer getDelegateId() {
    return delegateId;
  }

  public void setDelegateId(Integer delegateId) {
    this.delegateId = delegateId;
  }

  public DeviceDelegationsDTO delegateLevel(Integer delegateLevel) {
    this.delegateLevel = delegateLevel;
    return this;
  }

   /**
   * Get delegateLevel
   * @return delegateLevel
  **/
  @ApiModelProperty(value = "")
  public Integer getDelegateLevel() {
    return delegateLevel;
  }

  public void setDelegateLevel(Integer delegateLevel) {
    this.delegateLevel = delegateLevel;
  }

  public DeviceDelegationsDTO deviceId(String deviceId) {
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

  public DeviceDelegationsDTO fromUserLoginName(String fromUserLoginName) {
    this.fromUserLoginName = fromUserLoginName;
    return this;
  }

   /**
   * Get fromUserLoginName
   * @return fromUserLoginName
  **/
  @ApiModelProperty(value = "")
  public String getFromUserLoginName() {
    return fromUserLoginName;
  }

  public void setFromUserLoginName(String fromUserLoginName) {
    this.fromUserLoginName = fromUserLoginName;
  }

  public DeviceDelegationsDTO fromUserUserName(String fromUserUserName) {
    this.fromUserUserName = fromUserUserName;
    return this;
  }

   /**
   * Get fromUserUserName
   * @return fromUserUserName
  **/
  @ApiModelProperty(value = "")
  public String getFromUserUserName() {
    return fromUserUserName;
  }

  public void setFromUserUserName(String fromUserUserName) {
    this.fromUserUserName = fromUserUserName;
  }

  public DeviceDelegationsDTO toUserLoginName(String toUserLoginName) {
    this.toUserLoginName = toUserLoginName;
    return this;
  }

   /**
   * Get toUserLoginName
   * @return toUserLoginName
  **/
  @ApiModelProperty(value = "")
  public String getToUserLoginName() {
    return toUserLoginName;
  }

  public void setToUserLoginName(String toUserLoginName) {
    this.toUserLoginName = toUserLoginName;
  }

  public DeviceDelegationsDTO toUserUserName(String toUserUserName) {
    this.toUserUserName = toUserUserName;
    return this;
  }

   /**
   * Get toUserUserName
   * @return toUserUserName
  **/
  @ApiModelProperty(value = "")
  public String getToUserUserName() {
    return toUserUserName;
  }

  public void setToUserUserName(String toUserUserName) {
    this.toUserUserName = toUserUserName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceDelegationsDTO deviceDelegationsDTO = (DeviceDelegationsDTO) o;
    return Objects.equals(this.delegateDate, deviceDelegationsDTO.delegateDate) &&
        Objects.equals(this.delegateId, deviceDelegationsDTO.delegateId) &&
        Objects.equals(this.delegateLevel, deviceDelegationsDTO.delegateLevel) &&
        Objects.equals(this.deviceId, deviceDelegationsDTO.deviceId) &&
        Objects.equals(this.fromUserLoginName, deviceDelegationsDTO.fromUserLoginName) &&
        Objects.equals(this.fromUserUserName, deviceDelegationsDTO.fromUserUserName) &&
        Objects.equals(this.toUserLoginName, deviceDelegationsDTO.toUserLoginName) &&
        Objects.equals(this.toUserUserName, deviceDelegationsDTO.toUserUserName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delegateDate, delegateId, delegateLevel, deviceId, fromUserLoginName, fromUserUserName, toUserLoginName, toUserUserName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceDelegationsDTO {\n");
    
    sb.append("    delegateDate: ").append(toIndentedString(delegateDate)).append("\n");
    sb.append("    delegateId: ").append(toIndentedString(delegateId)).append("\n");
    sb.append("    delegateLevel: ").append(toIndentedString(delegateLevel)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    fromUserLoginName: ").append(toIndentedString(fromUserLoginName)).append("\n");
    sb.append("    fromUserUserName: ").append(toIndentedString(fromUserUserName)).append("\n");
    sb.append("    toUserLoginName: ").append(toIndentedString(toUserLoginName)).append("\n");
    sb.append("    toUserUserName: ").append(toIndentedString(toUserUserName)).append("\n");
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

