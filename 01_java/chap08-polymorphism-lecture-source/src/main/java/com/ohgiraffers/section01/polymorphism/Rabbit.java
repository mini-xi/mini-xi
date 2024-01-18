package com.ohgiraffers.section01.polymorphism;

public class Rabbit extends Animal{

    public void eat() {
        System.out.println("토끼가 풀을 뜯어 먹고 있습니다.");
    }

    @Override
    public void run() {
        System.out.println("토끼가 달려갑니다 깡총~ 깡총~");
    }

    @Override
    public void cry() {
        System.out.println("토끼가 울음소리를 냅니다. 끼익~! 끼익~!");
    }

    /* 설명. 토끼는 점프를 추가적으로 할 수 있다. */
    public void jump() {
        System.out.println("토끼가 점프합니다. 깡!!!!!! 초오오옹!!!!!!");
    }
}
