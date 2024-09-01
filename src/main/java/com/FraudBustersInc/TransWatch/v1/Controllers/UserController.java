package com.FraudBustersInc.TransWatch.v1.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String hellobro(){
        return "Hello Bro";
    }
}
