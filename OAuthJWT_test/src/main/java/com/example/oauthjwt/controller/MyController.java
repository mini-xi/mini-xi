package com.example.oauthjwt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @GetMapping("/register")
//    @ResponseBody
    public String myAPI() {

        return "register";
    }

//    @GetMapping("/mypage")
//    public String myPage() {
//        // 정적 디렉토리에 있는 `myPage.html` 파일을 반환합니다.
//        return "myPage";
//    }

    @GetMapping("/userLogin")
    public String redirectToLogin() {
        return "userLogin";
    }


}
