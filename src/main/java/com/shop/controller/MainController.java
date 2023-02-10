package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }
    @GetMapping("/")
    public String main() {
        return "main";
    }
}
