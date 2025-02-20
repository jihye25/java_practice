package com.hye.section02.looping_and_branching.level03.hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("2보다 큰 정수를 하나 입력하세요 : ");
        int n = in.nextInt();

        if(n>2){
        if ( (n==2)|| (n==3)||(n==5)||(n==7)||( (n%2!=0)   &&  (n%3!=0)&& (n%5!=0)&& (n%7!=0)  ) )
        {
            System.out.println("소수다.");
        } else {
            System.out.println("소수가 아니다.");
        }
    } else {
            System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");}
    }
}
