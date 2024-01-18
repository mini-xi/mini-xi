package com.minpractice.problem.clock;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("H: ");
        int H = sc.nextInt();

        if(0 < H && 24 < H){
            System.out.println("시간을 잘못 입력하셨습니다.");
            return;
        }

        System.out.print("M: ");
        int M = sc.nextInt();

        if(0 < M && 60 < M){
            System.out.println("분을 잘못 입력하셨습니다.");
            return;
        }

        if (M >= 45){
            M -= 45;
        } else {
            M += 15;
            if(H == 0){H = 23;} else{H -= 1;}
        }

        System.out.println("알람설정 시간은 " + H + "시 " + M + "분 입니다.");
    }
}
