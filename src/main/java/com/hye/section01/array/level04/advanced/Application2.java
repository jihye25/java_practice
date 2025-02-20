package com.hye.section01.array.level04.advanced;

import java.util.Random;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("4자리 숫자를 입력하세요 : ");
        int number = sc.nextInt();


        if( number<1000 || number>9999){
            System.out.println("4자리 정수를 입력해야 합니다.");
        return; }

        Random rand = new Random();
        int randomNumber= rand.nextInt(9000) + 1000;


        int chances=10;


      while(chances>0) {
          int strike = 0;
          int ball = 0;

          String numberStr = String.valueOf(number);
          String randomNumberStr = String.valueOf(randomNumber);

          for (int i = 0; i < 4; i++) {
              for (int j = 0; j < 4; j++) {
                  if (randomNumberStr.charAt(i) == numberStr.charAt(i)) {
                      strike++;
                  } else if (randomNumberStr.charAt(i) == numberStr.charAt(j)) {
                      ball++;
                  }
              }

              System.out.println("아쉽네요. " +strike + "S " + ball + "B 입니다.");


              if (strike == 4) {
                  System.out.println("정답입니다.");
                  break;
              }
              chances--;


              if (chances > 0) {
                  System.out.println(chances + "회 남으셨습니다.");
                  System.out.print("4자리 숫자를 입력하세요 : ");
                  number = sc.nextInt();

                  if (number < 1000 || number > 9999) {
                      System.out.print("4자리 정수를 입력해야 합니다.");
                      chances++;
                  }
              } else {
                  System.out.println("10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다.");
              } break;
          }
      }
}}
