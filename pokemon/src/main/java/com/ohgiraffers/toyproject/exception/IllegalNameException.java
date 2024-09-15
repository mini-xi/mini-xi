package com.ohgiraffers.toyproject.exception;

/* 설명. 사용자가 한글이나 영어 이외의 문자가 포함된 트레이너 이름을 입력했을 경우에 발생하는 예외를 처리한다. */
public class IllegalNameException extends Exception {
    public IllegalNameException(String message) {
        super(message);
    }
}
