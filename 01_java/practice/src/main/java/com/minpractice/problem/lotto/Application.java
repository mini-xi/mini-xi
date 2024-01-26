package com.minpractice.problem.lotto;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        int[] arr = new int[6];

        for (int i = 0; i < 6; i++) {
            arr[i] = (int) (Math.random() * 45 + 1);

            for (int j = 0; j < i; j++) {
                if(arr[j] != arr[i]) break;
            }
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

// 중복값 제거가 안 되서 while 문으로 쓰는게 좋음, 위에서는 지금 바로 뒤에 있는거만 볼 수 있다.