package com.example.oauthjwt.controller;

import com.example.oauthjwt.service.UserServiceImpl;
import com.example.oauthjwt.vo.RequestLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    private final UserServiceImpl userServiceImpl;

    @Autowired
    public LoginController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @PostMapping("/userLogin")
    public ResponseEntity<?> login(@RequestBody RequestLogin requestLogin) {
        boolean loginSuccess = userServiceImpl.login(requestLogin.getMemberEmail(), requestLogin.getPassword());

        if (loginSuccess) {
            return ResponseEntity.ok().body("로그인 성공");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("로그인 실패");
        }
    }
}
