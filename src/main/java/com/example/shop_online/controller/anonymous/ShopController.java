package com.example.shop_online.controller.anonymous;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopController {
    @GetMapping("/")
    public String getIndexPage(Model model){
        return "shop/index";
    }

    @GetMapping("/news")
    public String getNewsPage(Model model) {return "shop/news";}
}


