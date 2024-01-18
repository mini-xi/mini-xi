package com.minpractice.ClassExample;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculation cal = new Calculation();

        while (true) {
            System.out.println("======== 계산기 프로그램 ========");
            System.out.println("1. 더하기(A+B)");
            System.out.println("2. 빼기(A-B)");
            System.out.println("3. 곱하기(A*B)");
            System.out.println("4. 나누기(A/B)");
            System.out.println("5. 나머지(A%B)");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    cal.plusnum();
                    return;
                case 2:
                    cal.subnum();
                    return;
                case 3:
                    cal.multinum();
                    return;
                case 4:
                    cal.dividenum();
                    return;
                case 5:
                    cal.modnum();
                    return;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
                    break;
            }
        }
    }
}
