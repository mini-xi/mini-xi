package com.minpractice.polymorphism.food;

public class Application4 {
    public static void main(String[] args) {
        Application4 app4 = new Application4();
        Food randomFood = app4.getRandomFood();
        randomFood.cook();
    }

    private Food getRandomFood() {

        int random = (int) (Math.random() * 3);
        if(random == 0){
            return new Korean();
        } else if (random == 1) {
            return new Chinese();
        } else {return new Japanese();}
    }
}
