package com.hye.section01.conditional.level04.advanced;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("국어 점수를 입력하세요 : ");
        int korean = sc.nextInt();
        System.out.print("영어 점수를 입력하세요 : ");
        int english = sc.nextInt();
        System.out.print("수학 점수를 입력하세요 : ");
        int math = sc.nextInt();

        int avg = (korean + english + math) / 3;

        int result = 0;
        if (avg<60) {
        result = 1;
        }else if (korean<40){
            result = 2;
        }else if (english>40){
            result = 3;
        }else if (math>40){
            result = 4;
        }

        if(avg>=60 && korean>=40 && english>=40 && math>=40 ){
           System.out.println("합격입니다!");
        } else {
        switch (result){
        case 1 :
            System.out.println("국어 점수 미달로 불합격입니다.");
        case 2 :
            System.out.println("영어 점수 미달로 불합격입니다.");
        case 3 :
            System.out.println("수학 점수 미달로 불합격입니다.");
        case 4 :
            System.out.println("평균 점수 미달로 불합격입니다.");
        break;}}



    }
}
