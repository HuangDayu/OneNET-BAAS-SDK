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
 * 添加外部数据请求
 */
@ApiModel(description = "添加外部数据请求")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-26T17:00:09.998+08:00")
public class AddExternalData {
  @SerializedName("data")
  private Object data = null;

  @SerializedName("externalDataName")
  private String externalDataName = null;

  public AddExternalData data(Object data) {
    this.data = data;
    return this;
  }

   /**
   * 数据
   * @return data
  **/
  @ApiModelProperty(value = "数据")
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public AddExternalData externalDataName(String externalDataName) {
    this.externalDataName = externalDataName;
    return this;
  }

   /**
   * 外部数据名
   * @return externalDataName
  **/
  @ApiModelProperty(value = "外部数据名")
  public String getExternalDataName() {
    return externalDataName;
  }

  public void setExternalDataName(String externalDataName) {
    this.externalDataName = externalDataName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddExternalData addExternalData = (AddExternalData) o;
    return Objects.equals(this.data, addExternalData.data) &&
        Objects.equals(this.externalDataName, addExternalData.externalDataName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, externalDataName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddExternalData {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    externalDataName: ").append(toIndentedString(externalDataName)).append("\n");
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

