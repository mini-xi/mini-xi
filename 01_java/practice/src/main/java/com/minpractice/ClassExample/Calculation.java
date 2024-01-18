package com.minpractice.ClassExample;

public class Calculation {

    Number number = new Number();
    int a;
    int b;

    public void plusnum() {
        a = number.getNum1();
        b = number.getNum2();
        System.out.println("두 수의 합은 " + number.sum(a, b) + "입니다.");
    }

    public void subnum() {
        a = number.getNum1();
        b = number.getNum2();
        System.out.println("두 수의 차는 " + number.sub(a, b) + "입니다.");
    }

    public void multinum() {
        a = number.getNum1();
        b = number.getNum2();
        System.out.println("두 수의 곱은 " + number.multi(a, b) + "입니다.");
    }

    public void dividenum() {
        a = number.getNum1();
        b = number.getNum2();
        System.out.println("A/B 는 " + number.divide(a, b) + "입니다.");
    }

    public void modnum() {
        a = number.getNum1();
        b = number.getNum2();
        System.out.println("A%B 나머지는 " + number.mod(a, b) + "입니다.");
    }
}
