package com.bigdata.springproject.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author: zsp
 * @ Date: 2020/3/15 0015 下午 7:29
 * @ Version
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name, Model model){

        model.addAttribute("name", name);
        return "hello";
    }
}
