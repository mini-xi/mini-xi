package com.ohgiraffers.section02.uses;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.io.IOException;

/* 필기. insert->regist / update -> modify / delete -> remove / select->find 로 용어를 많이 씀 */

@WebServlet("/member/regist")
public class RegistMemberServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userId = req.getParameter("userId");
        String password = req.getParameter("password");
        String name = req.getParameter("name");

        System.out.println("userId = " + userId);
        System.out.println("password = " + password);         // 암호화 되기 전은 '평문'(=plain text)라고함. 암호화는 다이제스트
        System.out.println("name = " + name);

        /* 설명. 로그인 개념을 해보자.(암호화 된 비밀번호와 사용자가 입력한 값을 비교한다면?) */
        BCryptPasswordEncoder passwordEncoder =
                new BCryptPasswordEncoder();
        System.out.println("비밀번호가 pass01인지 확인: "
                + passwordEncoder.matches("pass01", password));
        System.out.println("비밀번호가 pass02인지 확인: "
                + passwordEncoder.matches("pass02", password));
    }
}
