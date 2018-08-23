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
 * Devices
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-26T17:00:09.998+08:00")
public class Devices {
  @SerializedName("apiKey")
  private String apiKey = null;

  @SerializedName("createDate")
  private Date createDate = null;

  @SerializedName("deviceGroupId")
  private Integer deviceGroupId = null;

  @SerializedName("deviceId")
  private String deviceId = null;

  @SerializedName("deviceName")
  private String deviceName = null;

  @SerializedName("deviceOwner")
  private Integer deviceOwner = null;

  @SerializedName("deviceStatus")
  private Integer deviceStatus = null;

  @SerializedName("extension")
  private String extension = null;

  @SerializedName("latitude")
  private Double latitude = null;

  @SerializedName("longitude")
  private Double longitude = null;

  public Devices apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/
  @ApiModelProperty(value = "")
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public Devices createDate(Date createDate) {
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

  public Devices deviceGroupId(Integer deviceGroupId) {
    this.deviceGroupId = deviceGroupId;
    return this;
  }

   /**
   * Get deviceGroupId
   * @return deviceGroupId
  **/
  @ApiModelProperty(value = "")
  public Integer getDeviceGroupId() {
    return deviceGroupId;
  }

  public void setDeviceGroupId(Integer deviceGroupId) {
    this.deviceGroupId = deviceGroupId;
  }

  public Devices deviceId(String deviceId) {
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

  public Devices deviceName(String deviceName) {
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

  public Devices deviceOwner(Integer deviceOwner) {
    this.deviceOwner = deviceOwner;
    return this;
  }

   /**
   * Get deviceOwner
   * @return deviceOwner
  **/
  @ApiModelProperty(value = "")
  public Integer getDeviceOwner() {
    return deviceOwner;
  }

  public void setDeviceOwner(Integer deviceOwner) {
    this.deviceOwner = deviceOwner;
  }

  public Devices deviceStatus(Integer deviceStatus) {
    this.deviceStatus = deviceStatus;
    return this;
  }

   /**
   * Get deviceStatus
   * @return deviceStatus
  **/
  @ApiModelProperty(value = "")
  public Integer getDeviceStatus() {
    return deviceStatus;
  }

  public void setDeviceStatus(Integer deviceStatus) {
    this.deviceStatus = deviceStatus;
  }

  public Devices extension(String extension) {
    this.extension = extension;
    return this;
  }

   /**
   * Get extension
   * @return extension
  **/
  @ApiModelProperty(value = "")
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }

  public Devices latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @ApiModelProperty(value = "")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Devices longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @ApiModelProperty(value = "")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Devices devices = (Devices) o;
    return Objects.equals(this.apiKey, devices.apiKey) &&
        Objects.equals(this.createDate, devices.createDate) &&
        Objects.equals(this.deviceGroupId, devices.deviceGroupId) &&
        Objects.equals(this.deviceId, devices.deviceId) &&
        Objects.equals(this.deviceName, devices.deviceName) &&
        Objects.equals(this.deviceOwner, devices.deviceOwner) &&
        Objects.equals(this.deviceStatus, devices.deviceStatus) &&
        Objects.equals(this.extension, devices.extension) &&
        Objects.equals(this.latitude, devices.latitude) &&
        Objects.equals(this.longitude, devices.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, createDate, deviceGroupId, deviceId, deviceName, deviceOwner, deviceStatus, extension, latitude, longitude);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Devices {\n");
    
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    deviceGroupId: ").append(toIndentedString(deviceGroupId)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    deviceOwner: ").append(toIndentedString(deviceOwner)).append("\n");
    sb.append("    deviceStatus: ").append(toIndentedString(deviceStatus)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

