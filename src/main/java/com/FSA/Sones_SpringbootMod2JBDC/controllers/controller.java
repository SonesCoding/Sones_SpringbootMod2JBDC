package com.FSA.Sones_SpringbootMod2JBDC.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class controller {

    @GetMapping("/home")
    public String Showhome(){
        return "home";
    }
}