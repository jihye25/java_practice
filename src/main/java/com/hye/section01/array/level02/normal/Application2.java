package com.hye.section01.array.level02.normal;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("주민등록번호를 입력하세요 : ");
        String number = scanner.nextLine();

       String maskedNumber = number.substring(0, 8);
maskedNumber+="******";
        System.out.println(maskedNumber);


    }
}
