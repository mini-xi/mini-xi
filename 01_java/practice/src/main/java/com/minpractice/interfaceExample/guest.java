package com.minpractice.interfaceExample;

public class guest extends member{
    public guest(String name){
        super(name);
    }

    @Override
    public void memuMade() {
        System.out.println(getName() + "이 메뉴를 주문합니다.");
    }

    @Override
    public void order(String food) {
        System.out.println(getName() + "이 질문합니다. 이 메뉴는 어떤거에요?");
    }

    @Override
    public void menu() {
        System.out.println("어떤 메뉴가 맛있나요?");
    }
}
