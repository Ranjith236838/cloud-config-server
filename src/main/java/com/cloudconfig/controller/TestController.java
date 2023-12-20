package com.cloudconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${secret-1}")
    String value1;

    @GetMapping
    public String returnSecretValue(){
        return value1;
    }
}
