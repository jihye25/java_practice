package com.hye.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
                System.out.print("정수를 입력하세요 : ");
                int row = scanner.nextInt();

                if(row>=1 && row<=10){
                    if(row%2==0){
                        System.out.println("짝수다.");
                    }else
                        System.out.println("홀수다.");

                }else
                    System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
            }
        }
