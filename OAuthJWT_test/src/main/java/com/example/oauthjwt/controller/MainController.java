package com.example.oauthjwt.controller;

import jakarta.servlet.annotation.WebServlet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

//    @GetMapping("/login")
//    public String redirectToLogin() {
//        return "redirect:/userLogin.html";
//    }

//    @GetMapping("/login")
//    public String redirectToLogin() {
//        return "login";
//    }

    @GetMapping("/")
//    @ResponseBody
    public String mainAPI() {

        return "myPage";
    }
}
