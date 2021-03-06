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
import com.chinamobile.iot.baas.sdk.ApiResponse;
import com.chinamobile.iot.baas.sdk.model.UserIdResponse;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-26T17:00:09.998+08:00")
public class AuthApiTest {

    private String accessId = "";
    private String accessKey = "";
    private String basePath = "http://demo.heclouds.com/baasapi";
    private final AuthApi api = new AuthApi(basePath,accessId,accessKey);
    private static Logger logger = LoggerFactory.getLogger(AuthApiTest.class);

    private String appToken = "";

    /**
     * 获取用户登录session-token
     * <p>
     * 获取用户登录session-token
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loginPostSessionTokenTest() throws ApiException {
        String loginName = "";
        String password = "";
        String sessionToken;
        try {
            sessionToken = api.loginPostSessionToken(appToken, loginName, password);
            if (sessionToken != null) {
                Assert.assertEquals("login success", true, true);
                System.out.println("获取用户登录session-token成功： "+sessionToken);
            } else {
                Assert.assertEquals("login failed", true, false);
            }
        } catch (Exception e) {
            logger.error("login failed!", e);
            System.out.println("获取用户登录session-token失败： "+e.getMessage());
            Assert.assertEquals("login failed", true, false);
        }
    }

    /**
     * 用户登录
     * <p>
     * 用户登录
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loginUsingPostTest() throws ApiException {
        String loginName = "";
        String password = "";
        ApiResponse<UserIdResponse> response;
        try {
            response = api.loginWithHttpInfo(appToken, loginName, password);
            if (response != null) {
                Assert.assertEquals("login success", true, true);
                System.out.println("用户登录成功： "+response.getData());
            } else {
                Assert.assertEquals("login failed", true, false);
            }
        } catch (Exception e) {
            logger.error("login failed!", e);
            System.out.println("用户登录失败： "+e.getMessage());
            Assert.assertEquals("login failed", true, false);

        }
    }
}
