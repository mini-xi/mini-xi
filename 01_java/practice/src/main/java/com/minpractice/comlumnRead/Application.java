package com.minpractice.comlumnRead;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] ch = new char[5][15];

        for (int i = 0; i < ch.length; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < str.length(); j++) {
                ch[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if(ch[j][i] == '\u0000') continue;
                System.out.print(ch[j][i]);
            }
        }
    }
}