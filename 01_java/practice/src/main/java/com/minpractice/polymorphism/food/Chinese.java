package com.minpractice.polymorphism.food;

public class Chinese extends Food{
    @Override
    public void eat() {
        System.out.println("뇸뇸 부먹? 찍먹? 탕수육은 뭐든 마싯따");
    }

    @Override
    public void cook() {
        System.out.println("으악! 기름 튄다!");
    }

    @Override
    public void look() {
        System.out.println("윤기가 좌르르~");
    }

    public void call() {
        System.out.println("사장님 아직 출발 안하셨나요? 아 예~ 방금 나갔어요~ ");
    }
}
