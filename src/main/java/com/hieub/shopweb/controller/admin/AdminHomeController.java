package com.hieub.shopweb.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminHomeController {
    @RequestMapping(value = "/admin/index")
    public String homeAdmin(){
        return "admin/index";
    }
}
