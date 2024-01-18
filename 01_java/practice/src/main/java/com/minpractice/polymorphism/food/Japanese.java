package com.minpractice.polymorphism.food;

public class Japanese extends Food{
    @Override
    public void eat() {
        System.out.println("이타다끼마스~");
    }

    @Override
    public void cook() {
        System.out.println("초밥밥알갯수는 320개로 부탁드립니다");
    }

    @Override
    public void look() {
        System.out.println("정갈하구만...");
    }

    public void menu() {
        System.out.println("덮밥 먹을까.. 스시 먹을까... 그것이 문제로다..");
    }
}
