package com.hye.section02.looping_and_branching.level03.hard;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int random = (int) (Math.random() * 100) + 1;
        int i = 0;

        while (true) {
            System.out.print("정수를 입력하세요 : ");
            int a = scanner.nextInt();
            i++;

            if(a<random) {
            System.out.println("입력하신 정수보다 작습니다.");
            } else if(a>random) {
            System.out.println("입력하신 정수보다 큽니다.");
            } else {
            System.out.println("정답입니다. " + i + "회만에 정답을 맞추셨습니다.");
            break;   }
        }
    }
}