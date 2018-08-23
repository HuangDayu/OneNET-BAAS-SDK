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
import com.chinamobile.iot.baas.sdk.model.UserDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PageInfoUserDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-26T17:00:09.998+08:00")
public class PageInfoUserDTO {
  @SerializedName("endRow")
  private Integer endRow = null;

  @SerializedName("firstPage")
  private Integer firstPage = null;

  @SerializedName("hasNextPage")
  private Boolean hasNextPage = null;

  @SerializedName("hasPreviousPage")
  private Boolean hasPreviousPage = null;

  @SerializedName("isFirstPage")
  private Boolean isFirstPage = null;

  @SerializedName("isLastPage")
  private Boolean isLastPage = null;

  @SerializedName("lastPage")
  private Integer lastPage = null;

  @SerializedName("list")
  private List<UserDTO> list = null;

  @SerializedName("navigateFirstPage")
  private Integer navigateFirstPage = null;

  @SerializedName("navigateLastPage")
  private Integer navigateLastPage = null;

  @SerializedName("navigatePages")
  private Integer navigatePages = null;

  @SerializedName("navigatepageNums")
  private List<Integer> navigatepageNums = null;

  @SerializedName("nextPage")
  private Integer nextPage = null;

  @SerializedName("orderBy")
  private String orderBy = null;

  @SerializedName("pageNum")
  private Integer pageNum = null;

  @SerializedName("pageSize")
  private Integer pageSize = null;

  @SerializedName("pages")
  private Integer pages = null;

  @SerializedName("prePage")
  private Integer prePage = null;

  @SerializedName("size")
  private Integer size = null;

  @SerializedName("startRow")
  private Integer startRow = null;

  @SerializedName("total")
  private Long total = null;

  public PageInfoUserDTO endRow(Integer endRow) {
    this.endRow = endRow;
    return this;
  }

   /**
   * Get endRow
   * @return endRow
  **/
  @ApiModelProperty(value = "")
  public Integer getEndRow() {
    return endRow;
  }

  public void setEndRow(Integer endRow) {
    this.endRow = endRow;
  }

  public PageInfoUserDTO firstPage(Integer firstPage) {
    this.firstPage = firstPage;
    return this;
  }

   /**
   * Get firstPage
   * @return firstPage
  **/
  @ApiModelProperty(value = "")
  public Integer getFirstPage() {
    return firstPage;
  }

  public void setFirstPage(Integer firstPage) {
    this.firstPage = firstPage;
  }

  public PageInfoUserDTO hasNextPage(Boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
    return this;
  }

   /**
   * Get hasNextPage
   * @return hasNextPage
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasNextPage() {
    return hasNextPage;
  }

  public void setHasNextPage(Boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
  }

  public PageInfoUserDTO hasPreviousPage(Boolean hasPreviousPage) {
    this.hasPreviousPage = hasPreviousPage;
    return this;
  }

   /**
   * Get hasPreviousPage
   * @return hasPreviousPage
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasPreviousPage() {
    return hasPreviousPage;
  }

  public void setHasPreviousPage(Boolean hasPreviousPage) {
    this.hasPreviousPage = hasPreviousPage;
  }

  public PageInfoUserDTO isFirstPage(Boolean isFirstPage) {
    this.isFirstPage = isFirstPage;
    return this;
  }

   /**
   * Get isFirstPage
   * @return isFirstPage
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsFirstPage() {
    return isFirstPage;
  }

  public void setIsFirstPage(Boolean isFirstPage) {
    this.isFirstPage = isFirstPage;
  }

  public PageInfoUserDTO isLastPage(Boolean isLastPage) {
    this.isLastPage = isLastPage;
    return this;
  }

   /**
   * Get isLastPage
   * @return isLastPage
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsLastPage() {
    return isLastPage;
  }

  public void setIsLastPage(Boolean isLastPage) {
    this.isLastPage = isLastPage;
  }

  public PageInfoUserDTO lastPage(Integer lastPage) {
    this.lastPage = lastPage;
    return this;
  }

   /**
   * Get lastPage
   * @return lastPage
  **/
  @ApiModelProperty(value = "")
  public Integer getLastPage() {
    return lastPage;
  }

  public void setLastPage(Integer lastPage) {
    this.lastPage = lastPage;
  }

  public PageInfoUserDTO list(List<UserDTO> list) {
    this.list = list;
    return this;
  }

  public PageInfoUserDTO addListItem(UserDTO listItem) {
    if (this.list == null) {
      this.list = new ArrayList<UserDTO>();
    }
    this.list.add(listItem);
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @ApiModelProperty(value = "")
  public List<UserDTO> getList() {
    return list;
  }

  public void setList(List<UserDTO> list) {
    this.list = list;
  }

  public PageInfoUserDTO navigateFirstPage(Integer navigateFirstPage) {
    this.navigateFirstPage = navigateFirstPage;
    return this;
  }

   /**
   * Get navigateFirstPage
   * @return navigateFirstPage
  **/
  @ApiModelProperty(value = "")
  public Integer getNavigateFirstPage() {
    return navigateFirstPage;
  }

  public void setNavigateFirstPage(Integer navigateFirstPage) {
    this.navigateFirstPage = navigateFirstPage;
  }

  public PageInfoUserDTO navigateLastPage(Integer navigateLastPage) {
    this.navigateLastPage = navigateLastPage;
    return this;
  }

   /**
   * Get navigateLastPage
   * @return navigateLastPage
  **/
  @ApiModelProperty(value = "")
  public Integer getNavigateLastPage() {
    return navigateLastPage;
  }

  public void setNavigateLastPage(Integer navigateLastPage) {
    this.navigateLastPage = navigateLastPage;
  }

  public PageInfoUserDTO navigatePages(Integer navigatePages) {
    this.navigatePages = navigatePages;
    return this;
  }

   /**
   * Get navigatePages
   * @return navigatePages
  **/
  @ApiModelProperty(value = "")
  public Integer getNavigatePages() {
    return navigatePages;
  }

  public void setNavigatePages(Integer navigatePages) {
    this.navigatePages = navigatePages;
  }

  public PageInfoUserDTO navigatepageNums(List<Integer> navigatepageNums) {
    this.navigatepageNums = navigatepageNums;
    return this;
  }

  public PageInfoUserDTO addNavigatepageNumsItem(Integer navigatepageNumsItem) {
    if (this.navigatepageNums == null) {
      this.navigatepageNums = new ArrayList<Integer>();
    }
    this.navigatepageNums.add(navigatepageNumsItem);
    return this;
  }

   /**
   * Get navigatepageNums
   * @return navigatepageNums
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getNavigatepageNums() {
    return navigatepageNums;
  }

  public void setNavigatepageNums(List<Integer> navigatepageNums) {
    this.navigatepageNums = navigatepageNums;
  }

  public PageInfoUserDTO nextPage(Integer nextPage) {
    this.nextPage = nextPage;
    return this;
  }

   /**
   * Get nextPage
   * @return nextPage
  **/
  @ApiModelProperty(value = "")
  public Integer getNextPage() {
    return nextPage;
  }

  public void setNextPage(Integer nextPage) {
    this.nextPage = nextPage;
  }

  public PageInfoUserDTO orderBy(String orderBy) {
    this.orderBy = orderBy;
    return this;
  }

   /**
   * Get orderBy
   * @return orderBy
  **/
  @ApiModelProperty(value = "")
  public String getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(String orderBy) {
    this.orderBy = orderBy;
  }

  public PageInfoUserDTO pageNum(Integer pageNum) {
    this.pageNum = pageNum;
    return this;
  }

   /**
   * Get pageNum
   * @return pageNum
  **/
  @ApiModelProperty(value = "")
  public Integer getPageNum() {
    return pageNum;
  }

  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }

  public PageInfoUserDTO pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @ApiModelProperty(value = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public PageInfoUserDTO pages(Integer pages) {
    this.pages = pages;
    return this;
  }

   /**
   * Get pages
   * @return pages
  **/
  @ApiModelProperty(value = "")
  public Integer getPages() {
    return pages;
  }

  public void setPages(Integer pages) {
    this.pages = pages;
  }

  public PageInfoUserDTO prePage(Integer prePage) {
    this.prePage = prePage;
    return this;
  }

   /**
   * Get prePage
   * @return prePage
  **/
  @ApiModelProperty(value = "")
  public Integer getPrePage() {
    return prePage;
  }

  public void setPrePage(Integer prePage) {
    this.prePage = prePage;
  }

  public PageInfoUserDTO size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public PageInfoUserDTO startRow(Integer startRow) {
    this.startRow = startRow;
    return this;
  }

   /**
   * Get startRow
   * @return startRow
  **/
  @ApiModelProperty(value = "")
  public Integer getStartRow() {
    return startRow;
  }

  public void setStartRow(Integer startRow) {
    this.startRow = startRow;
  }

  public PageInfoUserDTO total(Long total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageInfoUserDTO pageInfoUserDTO = (PageInfoUserDTO) o;
    return Objects.equals(this.endRow, pageInfoUserDTO.endRow) &&
        Objects.equals(this.firstPage, pageInfoUserDTO.firstPage) &&
        Objects.equals(this.hasNextPage, pageInfoUserDTO.hasNextPage) &&
        Objects.equals(this.hasPreviousPage, pageInfoUserDTO.hasPreviousPage) &&
        Objects.equals(this.isFirstPage, pageInfoUserDTO.isFirstPage) &&
        Objects.equals(this.isLastPage, pageInfoUserDTO.isLastPage) &&
        Objects.equals(this.lastPage, pageInfoUserDTO.lastPage) &&
        Objects.equals(this.list, pageInfoUserDTO.list) &&
        Objects.equals(this.navigateFirstPage, pageInfoUserDTO.navigateFirstPage) &&
        Objects.equals(this.navigateLastPage, pageInfoUserDTO.navigateLastPage) &&
        Objects.equals(this.navigatePages, pageInfoUserDTO.navigatePages) &&
        Objects.equals(this.navigatepageNums, pageInfoUserDTO.navigatepageNums) &&
        Objects.equals(this.nextPage, pageInfoUserDTO.nextPage) &&
        Objects.equals(this.orderBy, pageInfoUserDTO.orderBy) &&
        Objects.equals(this.pageNum, pageInfoUserDTO.pageNum) &&
        Objects.equals(this.pageSize, pageInfoUserDTO.pageSize) &&
        Objects.equals(this.pages, pageInfoUserDTO.pages) &&
        Objects.equals(this.prePage, pageInfoUserDTO.prePage) &&
        Objects.equals(this.size, pageInfoUserDTO.size) &&
        Objects.equals(this.startRow, pageInfoUserDTO.startRow) &&
        Objects.equals(this.total, pageInfoUserDTO.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endRow, firstPage, hasNextPage, hasPreviousPage, isFirstPage, isLastPage, lastPage, list, navigateFirstPage, navigateLastPage, navigatePages, navigatepageNums, nextPage, orderBy, pageNum, pageSize, pages, prePage, size, startRow, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageInfoUserDTO {\n");
    
    sb.append("    endRow: ").append(toIndentedString(endRow)).append("\n");
    sb.append("    firstPage: ").append(toIndentedString(firstPage)).append("\n");
    sb.append("    hasNextPage: ").append(toIndentedString(hasNextPage)).append("\n");
    sb.append("    hasPreviousPage: ").append(toIndentedString(hasPreviousPage)).append("\n");
    sb.append("    isFirstPage: ").append(toIndentedString(isFirstPage)).append("\n");
    sb.append("    isLastPage: ").append(toIndentedString(isLastPage)).append("\n");
    sb.append("    lastPage: ").append(toIndentedString(lastPage)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    navigateFirstPage: ").append(toIndentedString(navigateFirstPage)).append("\n");
    sb.append("    navigateLastPage: ").append(toIndentedString(navigateLastPage)).append("\n");
    sb.append("    navigatePages: ").append(toIndentedString(navigatePages)).append("\n");
    sb.append("    navigatepageNums: ").append(toIndentedString(navigatepageNums)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    prePage: ").append(toIndentedString(prePage)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    startRow: ").append(toIndentedString(startRow)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
