package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Controller
public class ShowController {
    @RequestMapping("/page")
    public String index(){
        return "page";
    }

}