package com.louanimashaun.LondonLashesandLocks.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LLLController {

        @RequestMapping("/")
        public String homePage(){
            return "index";
        }

}
