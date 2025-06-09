package com.theanh1301.TMDT.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {

    @RequestMapping("")
    public String home(){
        return "index";
    }
}
