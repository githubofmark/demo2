package com.demo2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Indexcontroller1 {
    @RequestMapping(value = "/")
    public String index(@RequestParam(value = "id",required = false,defaultValue = "1") Integer id){
        return "hello,"+id;
    }
}
