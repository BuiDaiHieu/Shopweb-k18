package com.hieub.shopweb.controller.user;

import org.springframework.web.bind.annotation.ModelAttribute;

public abstract class BaseController {
    @ModelAttribute("projectTitle")
    public String getProjectTitle(){
        return "shopweb";
    }
}
