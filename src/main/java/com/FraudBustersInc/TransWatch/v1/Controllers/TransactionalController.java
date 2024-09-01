package com.FraudBustersInc.TransWatch.v1.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionalController {

    @GetMapping("/v1/")
    public String give_name(){
        return "Hey bro";
    }
}
