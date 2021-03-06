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


package com.chinamobile.iot.baas.sdk.api;

import com.chinamobile.iot.baas.sdk.ApiException;
import com.chinamobile.iot.baas.sdk.model.PageInfoSqlTemplate;
import com.chinamobile.iot.baas.sdk.model.SqlTemplate;
import org.junit.Ignore;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Before;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SqlTemplateApi
 */
@Ignore
public class SqlTemplateApiTest {

    private String accessId = "";
    private String accessKey = "";
    private static Logger logger = LoggerFactory.getLogger(SqlTemplateApiTest.class);
    private String sessionToken;
    private String appToken = "";
    private String basePath = "http://demo.heclouds.com/baasapi";

    private final SqlTemplateApi api = new SqlTemplateApi(basePath,accessId,accessKey);

      @Before
        public void getSessionToken(){
            AuthApi authApi = new AuthApi(basePath,accessId,accessKey);
            String loginName = "";
            String password = "";
            try {
                sessionToken = authApi.loginPostSessionToken(appToken, loginName, password);
                logger.info("获取sessionToken成功,session-token： "+sessionToken);
            }catch (Exception e){
                logger.error("获取sessionToken失败： "+e.getMessage());
            }
        }

    
    /**
     * 查询指定sql模版
     *
     * 查询指定sql模版
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findTemplateByIdUsingGETTest() throws ApiException {
        Integer sqlTemplateId = null;
        SqlTemplate response = api.findTemplateByIdUsingGET(sqlTemplateId,sessionToken);

        // TODO: test validations
    }
    
    /**
     * 查询sql模版列表
     *
     * 查询sql模版列表
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTemplatesUsingGETTest() throws ApiException {
        String sqlType = null;
        String sqlTemplateType = null;
        String sqlTemplateName = null;
        String sqlDataTypes = null;
        String pageNum = null;
        String pageSize = null;
        PageInfoSqlTemplate response = api.getTemplatesUsingGET(sessionToken,sqlType,sqlTemplateType,sqlTemplateName,sqlDataTypes,pageNum,pageSize);

        // TODO: test validations
    }
    
}
