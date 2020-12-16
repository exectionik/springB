package com.appslab.springbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Snail {


    @RequestMapping("/snail")
    public double snail(@RequestParam double heightS,@RequestParam double heightT,@RequestParam double widthS){

        return ((heightS+widthS)*(heightT/heightS));
    }
}

