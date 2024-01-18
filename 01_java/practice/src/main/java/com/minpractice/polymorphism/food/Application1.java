package com.minpractice.polymorphism.food;

public class Application1 {
    public static void main(String[] args) {

        System.out.println("======= 음식 좋아~ ==========");
        Food food = new Food();
        food.eat();
        food.cook();
        food.look();
        System.out.println("");

        System.out.println("===== 한식 좋아! ======");
        Korean korean = new Korean();
        korean.eat();
        korean.cook();
        korean.look();
        korean.taste();
        System.out.println("");

        System.out.println("===== 중식 좋아! ======");
        Chinese chinese = new Chinese();
        chinese.eat();
        chinese.cook();
        chinese.look();
        chinese.call();
        System.out.println("");

        System.out.println("===== 일식 좋아! ======");
        Japanese japanese = new Japanese();
        japanese.eat();
        japanese.cook();
        japanese.look();
        japanese.menu();
        System.out.println("");

        System.out.println("=================동적 바인딩 확인");
        Food food1 = new Korean();
        Food food2 = new Chinese();
        Food food3 = new Japanese();

        food1.eat();
        food2.eat();
        food3.eat();
    }
}
