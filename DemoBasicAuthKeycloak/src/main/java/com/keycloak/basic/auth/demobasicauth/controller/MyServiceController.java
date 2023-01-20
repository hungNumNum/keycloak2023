package com.keycloak.basic.auth.demobasicauth.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Validated
public class MyServiceController {


    @GetMapping
    @ResponseBody
    public String myAppService() {
       return "Hi welcome keycloak user";
    }

}
