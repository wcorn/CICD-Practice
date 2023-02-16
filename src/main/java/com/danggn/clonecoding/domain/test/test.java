package com.danggn.clonecoding.domain.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @RequestMapping("/test")
    public String greeting() {
        return "test!!";
    }
}
