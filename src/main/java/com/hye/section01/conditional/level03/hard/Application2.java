package com.hye.section01.conditional.level04;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("과일 이름을 입력하세요 : ");
        String fruit = scanner.nextLine();

        if (fruit.equals("사과")) {
            System.out.println("사과 : 1000원");

        } else if (fruit.equals("바나나")) {
            System.out.println("바나나 : 3000원");
        } else if (fruit.equals("복숭아")) {
            System.out.println("복숭아 : 2000원");
        } else if (fruit.equals("키위")) {
            System.out.println("키위 : 5000원");
        } else {
            System.out.println("준비된 상품이 없습니다.");
        }
    }
}