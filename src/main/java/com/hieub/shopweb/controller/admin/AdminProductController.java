package com.hieub.shopweb.controller.admin;

import com.hieub.shopweb.model.Category;
import com.hieub.shopweb.model.Product;
import com.hieub.shopweb.service.CategoryService;
import com.hieub.shopweb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "/admin/pruduct")
public class AdminProductController {
    @Autowired
    public ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getAllProduct(Model model){
        List<Product> products = productService.getAll();
        model.addAttribute("products", products);
        return "admin/product";
    }

    @RequestMapping(value = "/add")
    public String addProduct(Model model){
        Product product = new Product();
        List<Category> categories = categoryService.getAll();
        model.addAttribute("product", product);
        model.addAttribute("categories", categories);
        return "/admin/productAdd";
    }
}
