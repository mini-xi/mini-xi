package com.minpractice.starpractice;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* 필기. 별 다이아몬드 형식으로 만들어보기 */
        /*   예시:       *
         *             ***
         *            *****
         *             ***
         *              *
         *  입력값 받고 가운데가 그 숫자로 채워지게
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("마름모의 한 변의 길이(양수)를 입력하시오: ");
        int input = sc.nextInt();

        for (int i = 0; i <= (input-1)*2; i++) {

            if(i % 2 ==0) continue;
            for (int j = 1; j <= input*2 - 1 - i; j+=2) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int j = 1; j <= (input*2-1); j++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = (input-1)*2; i >= 1; i--) {
            if(i % 2 ==0) continue;
            for (int j = input*2 - 1 - i; j > 1; j-=2) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}