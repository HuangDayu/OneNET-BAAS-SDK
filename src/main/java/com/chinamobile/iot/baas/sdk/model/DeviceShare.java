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
 * 分享的权限
 */
@ApiModel(description = "分享的权限")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-26T17:00:09.998+08:00")
public class DeviceShare {
  @SerializedName("name")
  private String name = null;

  @SerializedName("share")
  private String share = null;

  @SerializedName("type")
  private String type = null;

  public DeviceShare name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 分享名
   * @return name
  **/
  @ApiModelProperty(value = "分享名")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DeviceShare share(String share) {
    this.share = share;
    return this;
  }

   /**
   * 分享的权限
   * @return share
  **/
  @ApiModelProperty(value = "分享的权限")
  public String getShare() {
    return share;
  }

  public void setShare(String share) {
    this.share = share;
  }

  public DeviceShare type(String type) {
    this.type = type;
    return this;
  }

   /**
   * 分享类型
   * @return type
  **/
  @ApiModelProperty(value = "分享类型")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceShare deviceShare = (DeviceShare) o;
    return Objects.equals(this.name, deviceShare.name) &&
        Objects.equals(this.share, deviceShare.share) &&
        Objects.equals(this.type, deviceShare.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, share, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceShare {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    share: ").append(toIndentedString(share)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

