package com.eric.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api(value = "TestController")
public class TestController {
    
    @GetMapping("/")
    @ApiOperation("index")
    public String index() {
        return "welcome to swagger ui";
    }

    @GetMapping("/aa")
    @ApiOperation("index")
    public String indexaa() {
        return "welcome to swagger ui";
    }



    @PostMapping("/getUser")
    @ApiOperation("获取用户信息")
    public String getUserInfo(@ApiParam(value = "用户名称" , name = "username")String username){
        return "" ;
    }
}