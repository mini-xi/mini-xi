package com.minpractice.problem.mod;

import java.util.Arrays;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] mod = new int[10];

        for (int i = 0; i < mod.length; i++) {
            mod[i] = arr[i] % 42;
        }

        int[] newMod = Arrays.stream(mod).distinct().toArray();     // 중복값 제거
        System.out.println(newMod.length);
    }
}
