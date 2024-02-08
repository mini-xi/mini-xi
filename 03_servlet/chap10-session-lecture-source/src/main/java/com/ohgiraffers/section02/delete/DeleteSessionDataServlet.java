package com.ohgiraffers.section02.delete;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/delete")
public class DeleteSessionDataServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        System.out.println("attribute 만료 전 firstName: " + session.getAttribute("firstName"));
        System.out.println("attribute 만료 전 lastName: " + session.getAttribute("lastName"));
        System.out.println();

        session.invalidate();       // HttpSession 객체의 Attribute 값들을 무효화(아래에 getAttribute를 못 쓰게 만든다)
        System.out.println("attribute 만료 후 firstName: " + session.getAttribute("firstName"));
        System.out.println("attribute 만료 후 lastName: " + session.getAttribute("lastName"));

        /* 설명. session이 무효화 되어 attribute를 가져올 수 없게 되고 500에러 발생 */
        /* 필기. session은 request와 달리 요청 응답에 따르는게 아님. */
    }
}
