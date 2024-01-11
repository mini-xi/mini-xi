package com.ohgiraffers.section01.literal;

public class Application1 {
    public static void main(String[] args) {

        // 한 줄 주석                             필기. 모든 주석은 한 줄 ENTER치고 하기
        /* 범위 주석 */
        /*
            여러줄
            주석이
            가능
         */

        /* 수업목표. 여러 가지 값의 형태를 출력할 수 있다. */
        /* 목차. 1. 숫자 형태의 값 */
        /* 목차. 1-1. 정수 형태의 값 출력 */
        System.out.println(123);

                                             /* 필기. sout을 쓰면 System.out 나온다 */
        /* 목차. 1-2. 실수 형태의 값 출력 */
        System.out.println(1.234);

        /* 목차. 2. 문자 형태의 값 출력 */
        System.out.println('a');            // 설명. 문자는 single quatation(')을 적용한다.
        System.out.println('1');
//        System.out.println('ab');         // 설명. 컴파일 에러(문법 오류)
        System.out.println('\u0000');       /* 설명. u는 유니코드를 말하고 0번은 빈 칸이기 때문에 아무것도 안 넣고싶을 때는
                                                    아무 것도 안 넣으면 에러 발생하기 때문에 \u0000 입력*/

        /* 목차. 3. 문자열 형태의 값 출력 */
        System.out.println("안녕하세요");     // 설명. 문자열은 double quatation(")을 적용한다.
        System.out.println("a");
        System.out.println("");             // 설명. 아무 것도 안 넣는 문자열은 가능

        /* 목차. 4. 논리 형태의 값 출력 */
        System.out.println(true);
        System.out.println("true");         // 설명. double quatation이 붙었기 때문에 문자열
        System.out.println(false);          // 설명. true 또는 false 두 값만 논리 값이다.
    }
}
