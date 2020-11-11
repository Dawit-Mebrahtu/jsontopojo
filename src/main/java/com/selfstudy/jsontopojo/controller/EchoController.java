package com.selfstudy.jsontopojo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @GetMapping("/")
    public String echo(){
        return "Echo";
    }
}
