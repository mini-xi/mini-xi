package com.minpractice.interfaceExample;

public class Application {
    public static void main(String[] args) {
        // 웨이터와 주방 스태프 인스턴스 생성
        guest guest = new guest("손님");
        chief chief = new chief("셰프");

        // 주문 처리 예시
        guest.order("떡볶이");
        guest.menu();
        guest.memuMade();
        System.out.println("");

        chief.order("부타동");
        chief.menu();
        chief.memuMade();
    }
}

