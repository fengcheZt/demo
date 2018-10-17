package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.NeoProperties;

@RestController
public class HelloWorldController {
	@Autowired
	NeoProperties neo;
	@RequestMapping("/hello")
    public String index() {
        return neo.getHellworld();
    }
}
