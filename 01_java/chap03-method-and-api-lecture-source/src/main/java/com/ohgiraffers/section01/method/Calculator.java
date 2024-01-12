package com.ohgiraffers.section01.method;

public class Calculator {

    public int plusTwoNumbers(int first, int second){
        return first + second;
    }

    public int subTwoNumbers(int first, int second){
        return first - second;
    }

    public int multiTwoNumbers(int first, int second){
        return first * second;
    }

    public double divideTwoNumbers(int first, int second){
        return first / (double)second;
    }

    private int minTwoNumbers(int first, int second){
        return (first > second) ? second : first;
    }

    public static int maxNumberOf(int first, int second){
        return (first > second) ? first : second;
    }
}
