package com.minpractice.starpractice;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("양수를 입력하시오: ");
        int input = sc.nextInt();

        if (!(input % 2 == 0)) {
            for (int i = 1; i <= (input+1)/2; i++) {
                for (int j = 1; j <= input-2; j += 2) {
                    System.out.print("_");
                }

                for (int j = 1; j <= (i * 2) - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = (input-1)/2; i >= 1; i--) {
                for (int j = 1; j <= input - i; j += 2) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= (i * 2) - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }else {
            for (int i = 1; i <= input; i++)
                for (int j = 1; j <= input - i; j++) {
                    System.out.print(" ");
                }

            for (int j = 1; j <= input; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}