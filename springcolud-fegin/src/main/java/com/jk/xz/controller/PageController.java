package com.jk.xz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController {
    @RequestMapping("addOrUp")
    public String addOrUp(){
        return "addOrUp";
    }
}
