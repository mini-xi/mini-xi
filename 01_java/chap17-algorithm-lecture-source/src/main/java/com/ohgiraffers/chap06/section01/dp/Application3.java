package com.ohgiraffers.chap06.section01.dp;

import java.io.*;

public class Application3 {

    public static BufferedReader toBufferedReader(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes());
        return new BufferedReader(new InputStreamReader(is));
    }

    /* 설명. 최대 100까지 입력 가능하므로 101크기 dp배열(dp테이블) 준비 */
    public static Integer[] dp = new Integer[101];

    public static int solution(int n) throws IOException{
//        dp[0] = 0;      // 이건 할 필요 없음
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
//        dp[4] = 2;
//        dp[5] = 2;
        return padovan(n);
    }

    private static int padovan(int n){

//        System.out.println("n = " + n);

        /* 설명. if문은 기존에 dp에 값이 있을 때 점화식을 다시 사용하지 않도록 조건식 작성(효율을 위함) */
        if(dp[n] == null)          // 방문 배열 개념
        dp[n] = padovan(n - 2) + padovan(n - 3);    // 현재 위치의 값(n)은 3번째 전(n-3)과 2번째 전(n-2)의 값을 더하는 것이다.
//        dp[n] = padovan(n - 1) + padovan(n - 5);         // 주석된거 풀면 이거도 테스트 통과(dp[4], dp[5]가 들어가야함)
        return dp[n];
    }
}
