package com.theanh1301.TMDT.controllers.admin;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

    @RequestMapping("/admin")
    public String admin(){
//        Ghi nhu vay de phan biet voi index
        return "admin/index";
    }
}
