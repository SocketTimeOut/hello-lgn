package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ChenMengLong
 * @version v1.0
 * 2020/10/1
 */
@Controller
@RequestMapping("demo")
public class demoController {
    @PostMapping
    public String demo(){
        return "demo";
    }
}
