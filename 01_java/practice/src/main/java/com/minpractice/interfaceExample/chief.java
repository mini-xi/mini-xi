package com.minpractice.interfaceExample;

public class chief extends member{
    public chief(String name) {
        super(name);
    }

    @Override
    public void order(String food) {
        System.out.println(getName() + "가 메뉴를 만듭니다.");
    }

    @Override
    public void menu() {
        System.out.println(getName() +  "가 메뉴를 설명합니다.");
    }

    @Override
    public void memuMade() {
        System.out.println("볶음? 튀김? 삶음? 굽기?");
    }
}
