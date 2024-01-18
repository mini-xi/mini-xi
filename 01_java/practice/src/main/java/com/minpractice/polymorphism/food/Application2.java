package com.minpractice.polymorphism.food;

public class Application2 {
    public static void main(String[] args) {
        Food[] foods = new Food[3];
        foods[0] = new Korean();
        foods[1] = new Chinese();
        foods[2] = new Japanese();

        for (int i = 0; i < foods.length; i++) {
            foods[i].look();
        }

        for(Food food : foods){
            food.look();
            if(food instanceof Korean){
                ((Korean) food).taste();
            }
            if(food instanceof Chinese){
                ((Chinese) food).call();
            }
            if(food instanceof Japanese){
                ((Japanese) food).menu();
            }
        }
    }
}
