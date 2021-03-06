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
 * SqlTemplate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-26T17:00:09.998+08:00")
public class SqlTemplate {
  @SerializedName("sqlDataType")
  private Integer sqlDataType = null;

  @SerializedName("sqlTemplateContent")
  private String sqlTemplateContent = null;

  @SerializedName("sqlTemplateId")
  private Integer sqlTemplateId = null;

  @SerializedName("sqlTemplateName")
  private String sqlTemplateName = null;

  @SerializedName("sqlTemplateParam")
  private String sqlTemplateParam = null;

  @SerializedName("sqlTemplateType")
  private Integer sqlTemplateType = null;

  @SerializedName("sqlType")
  private Integer sqlType = null;

  public SqlTemplate sqlDataType(Integer sqlDataType) {
    this.sqlDataType = sqlDataType;
    return this;
  }

   /**
   * Get sqlDataType
   * @return sqlDataType
  **/
  @ApiModelProperty(value = "")
  public Integer getSqlDataType() {
    return sqlDataType;
  }

  public void setSqlDataType(Integer sqlDataType) {
    this.sqlDataType = sqlDataType;
  }

  public SqlTemplate sqlTemplateContent(String sqlTemplateContent) {
    this.sqlTemplateContent = sqlTemplateContent;
    return this;
  }

   /**
   * Get sqlTemplateContent
   * @return sqlTemplateContent
  **/
  @ApiModelProperty(value = "")
  public String getSqlTemplateContent() {
    return sqlTemplateContent;
  }

  public void setSqlTemplateContent(String sqlTemplateContent) {
    this.sqlTemplateContent = sqlTemplateContent;
  }

  public SqlTemplate sqlTemplateId(Integer sqlTemplateId) {
    this.sqlTemplateId = sqlTemplateId;
    return this;
  }

   /**
   * Get sqlTemplateId
   * @return sqlTemplateId
  **/
  @ApiModelProperty(value = "")
  public Integer getSqlTemplateId() {
    return sqlTemplateId;
  }

  public void setSqlTemplateId(Integer sqlTemplateId) {
    this.sqlTemplateId = sqlTemplateId;
  }

  public SqlTemplate sqlTemplateName(String sqlTemplateName) {
    this.sqlTemplateName = sqlTemplateName;
    return this;
  }

   /**
   * Get sqlTemplateName
   * @return sqlTemplateName
  **/
  @ApiModelProperty(value = "")
  public String getSqlTemplateName() {
    return sqlTemplateName;
  }

  public void setSqlTemplateName(String sqlTemplateName) {
    this.sqlTemplateName = sqlTemplateName;
  }

  public SqlTemplate sqlTemplateParam(String sqlTemplateParam) {
    this.sqlTemplateParam = sqlTemplateParam;
    return this;
  }

   /**
   * Get sqlTemplateParam
   * @return sqlTemplateParam
  **/
  @ApiModelProperty(value = "")
  public String getSqlTemplateParam() {
    return sqlTemplateParam;
  }

  public void setSqlTemplateParam(String sqlTemplateParam) {
    this.sqlTemplateParam = sqlTemplateParam;
  }

  public SqlTemplate sqlTemplateType(Integer sqlTemplateType) {
    this.sqlTemplateType = sqlTemplateType;
    return this;
  }

   /**
   * Get sqlTemplateType
   * @return sqlTemplateType
  **/
  @ApiModelProperty(value = "")
  public Integer getSqlTemplateType() {
    return sqlTemplateType;
  }

  public void setSqlTemplateType(Integer sqlTemplateType) {
    this.sqlTemplateType = sqlTemplateType;
  }

  public SqlTemplate sqlType(Integer sqlType) {
    this.sqlType = sqlType;
    return this;
  }

   /**
   * Get sqlType
   * @return sqlType
  **/
  @ApiModelProperty(value = "")
  public Integer getSqlType() {
    return sqlType;
  }

  public void setSqlType(Integer sqlType) {
    this.sqlType = sqlType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SqlTemplate sqlTemplate = (SqlTemplate) o;
    return Objects.equals(this.sqlDataType, sqlTemplate.sqlDataType) &&
        Objects.equals(this.sqlTemplateContent, sqlTemplate.sqlTemplateContent) &&
        Objects.equals(this.sqlTemplateId, sqlTemplate.sqlTemplateId) &&
        Objects.equals(this.sqlTemplateName, sqlTemplate.sqlTemplateName) &&
        Objects.equals(this.sqlTemplateParam, sqlTemplate.sqlTemplateParam) &&
        Objects.equals(this.sqlTemplateType, sqlTemplate.sqlTemplateType) &&
        Objects.equals(this.sqlType, sqlTemplate.sqlType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sqlDataType, sqlTemplateContent, sqlTemplateId, sqlTemplateName, sqlTemplateParam, sqlTemplateType, sqlType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SqlTemplate {\n");
    
    sb.append("    sqlDataType: ").append(toIndentedString(sqlDataType)).append("\n");
    sb.append("    sqlTemplateContent: ").append(toIndentedString(sqlTemplateContent)).append("\n");
    sb.append("    sqlTemplateId: ").append(toIndentedString(sqlTemplateId)).append("\n");
    sb.append("    sqlTemplateName: ").append(toIndentedString(sqlTemplateName)).append("\n");
    sb.append("    sqlTemplateParam: ").append(toIndentedString(sqlTemplateParam)).append("\n");
    sb.append("    sqlTemplateType: ").append(toIndentedString(sqlTemplateType)).append("\n");
    sb.append("    sqlType: ").append(toIndentedString(sqlType)).append("\n");
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

