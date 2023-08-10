package com.manual.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/index")
    public String homepage() {
        return "index";
    }

    // handler method to handle login request
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
