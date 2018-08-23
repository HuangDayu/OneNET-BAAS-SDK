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
 * 添加用户请求
 */
@ApiModel(description = "添加用户请求")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-26T17:00:09.998+08:00")
public class AddUserRequest {
  @SerializedName("email")
  private String email = null;

  @SerializedName("extension")
  private Object extension = null;

  @SerializedName("loginName")
  private String loginName = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("roleId")
  private Integer roleId = null;

  @SerializedName("userName")
  private String userName = null;

  public AddUserRequest email(String email) {
    this.email = email;
    return this;
  }

   /**
   * 邮箱地址
   * @return email
  **/
  @ApiModelProperty(value = "邮箱地址")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AddUserRequest extension(Object extension) {
    this.extension = extension;
    return this;
  }

   /**
   * 用户扩展数据
   * @return extension
  **/
  @ApiModelProperty(value = "用户扩展数据")
  public Object getExtension() {
    return extension;
  }

  public void setExtension(Object extension) {
    this.extension = extension;
  }

  public AddUserRequest loginName(String loginName) {
    this.loginName = loginName;
    return this;
  }

   /**
   * 登录名
   * @return loginName
  **/
  @ApiModelProperty(value = "登录名")
  public String getLoginName() {
    return loginName;
  }

  public void setLoginName(String loginName) {
    this.loginName = loginName;
  }

  public AddUserRequest phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * 手机号码
   * @return phone
  **/
  @ApiModelProperty(value = "手机号码")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public AddUserRequest roleId(Integer roleId) {
    this.roleId = roleId;
    return this;
  }

   /**
   * 角色Id
   * @return roleId
  **/
  @ApiModelProperty(value = "角色Id")
  public Integer getRoleId() {
    return roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }

  public AddUserRequest userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * 用户名
   * @return userName
  **/
  @ApiModelProperty(value = "用户名")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddUserRequest addUserRequest = (AddUserRequest) o;
    return Objects.equals(this.email, addUserRequest.email) &&
        Objects.equals(this.extension, addUserRequest.extension) &&
        Objects.equals(this.loginName, addUserRequest.loginName) &&
        Objects.equals(this.phone, addUserRequest.phone) &&
        Objects.equals(this.roleId, addUserRequest.roleId) &&
        Objects.equals(this.userName, addUserRequest.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, extension, loginName, phone, roleId, userName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddUserRequest {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    loginName: ").append(toIndentedString(loginName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

