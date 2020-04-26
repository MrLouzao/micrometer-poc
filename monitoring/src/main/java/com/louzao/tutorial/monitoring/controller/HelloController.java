package com.louzao.tutorial.monitoring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/hello-friend")
    public String hello(@RequestParam(required = false, name = "name") String name) {
        if (name != null) {
            return "Hello " + name + "!!";
        }
        else {
            return "Hello visitor!!!";
        }
    }


}
