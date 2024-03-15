package com.hieub.shopweb.controller.admin;

import com.hieub.shopweb.model.Category;
import com.hieub.shopweb.repository.CategoryRepository;
import com.hieub.shopweb.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class AdminCategoryController {

    @Autowired
    public CategoryService categoryService;

    @RequestMapping(value = "/admin/category", method = RequestMethod.GET)
    public String getAllCategory(Model model){
        List<Category> categories = categoryService.getAll();
        model.addAttribute("categories", categories);
        return "admin/category";
    }
}

