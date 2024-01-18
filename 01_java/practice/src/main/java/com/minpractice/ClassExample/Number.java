package com.minpractice.ClassExample;

import java.util.Scanner;

public class Number {

    private int num1;
    private int num2;
    Scanner sc = new Scanner(System.in);
    public Number() {}

    public int getNum1() {
        System.out.print("A값을 입력해주세요 : ");
        int num1 = sc.nextInt();
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        System.out.print("B값을 입력해주세요 : ");
        int num2 = sc.nextInt();
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public int multi(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        return num1 / num2;
    }

    public int mod(int num1, int num2) {
        return num1 % num2;
    }
}
