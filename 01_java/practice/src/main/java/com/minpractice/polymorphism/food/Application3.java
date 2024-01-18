package com.minpractice.polymorphism.food;

public class Application3 {
    public static void main(String[] args) {
        Application3 app3 = new Application3();

        app3.nham(new Korean());
        app3.nham(new Chinese());
        app3.nham(new Japanese());
    }

    private void nham(Food jeopjeop){
        jeopjeop.eat();
    }
}

