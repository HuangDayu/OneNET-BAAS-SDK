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
import com.chinamobile.iot.baas.sdk.model.CustomPermission;
import com.chinamobile.iot.baas.sdk.model.PageInfoCustomPermission;
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
 * API tests for CustomPermissionApi
 */
@Ignore
public class CustomPermissionApiTest {

    private String accessId = "";
    private String accessKey = "";
    private static Logger logger = LoggerFactory.getLogger(CustomPermissionApiTest.class);
    private String sessionToken;
    private String appToken = "";
    private String basePath = "http://demo.heclouds.com/baasapi";

    private final CustomPermissionApi api = new CustomPermissionApi(basePath,accessId,accessKey);

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
     * 查询当前用户拥有的自定义权限
     *
     * 查询当前用户拥有的自定义权限
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findCustomPermissionByUserUsingGETTest() throws ApiException {
        List<CustomPermission> response = api.findCustomPermissionByUserUsingGET(sessionToken);

        // TODO: test validations
    }
    
    /**
     * 查询自定义权限
     *
     * 查询自定义权限
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findCustomPermissionUsingGETTest() throws ApiException {
        String customPermissionId = null;
        String customPermissionName = null;
        String pageNum = null;
        String pageSize = null;
        PageInfoCustomPermission response = api.findCustomPermissionUsingGET(sessionToken,customPermissionId,customPermissionName,pageNum,pageSize);

        // TODO: test validations
    }
    
}
