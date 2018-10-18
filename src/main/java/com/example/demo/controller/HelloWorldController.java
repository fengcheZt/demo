package com.example.demo.controller;

import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.NeoProperties;

@Controller

public class HelloWorldController {
	@Autowired
	NeoProperties neo;
	@RequestMapping(value = "/hello")
    public String hello(Model model) {
		String name = neo.getHellworld();
        model.addAttribute("name", name);
        return "/hello";
    }
	@RequestMapping("/uid")
    String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        return session.getId();
    }
}
