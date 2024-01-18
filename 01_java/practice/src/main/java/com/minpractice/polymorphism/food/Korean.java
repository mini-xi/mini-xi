package com.minpractice.polymorphism.food;

public class Korean extends Food{
    @Override
    public void eat() {
        System.out.println("이거슨!!!! 집밥 아닙니까!!");
    }

    @Override
    public void cook() {
        System.out.println("으따야~ 설탕은 넣었어유?(백종원)");
    }

    @Override
    public void look() {
        System.out.println("김이 모락모락....");
    }

    public void taste() {
        System.out.println("아이고 매워! 스읍하 스읍하");
    }
}
