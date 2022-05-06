package com.example.demo.controller;

import com.example.demo.entity.pageResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/page")
public class PageController {
    @RequestMapping("/list")
    public String page(){
//        System.out.println(0);
//        List<PageController> p = new ArrayList<>();
//        for(int i =0;i<10;i++){
//            pageResult pageResult = new pageResult();
//            pageResult.setTotalPage(i);
//        }
        return "{ \"totalPage\":\"10\"}";
    }
}