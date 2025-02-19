package com.hye.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application2 {

         public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("체중(kg)을 입력하세요 :");
            double width=scanner.nextDouble();

            System.out.print("신장(m)을 입력하세요 :");
            double height=scanner.nextDouble();

            double BMI=width/(height*height);

            if( BMI<20){
                System.out.println("당신은 저체중 입니다.");
            } else if (BMI<25){
                System.out.println("당신은 정상체중 입니다.");
            } else if ( BMI<30){
                System.out.println("당신은 과체중 입니다.");
            } else
                System.out.println("당신은 비만 입니다.");
        }
    }




