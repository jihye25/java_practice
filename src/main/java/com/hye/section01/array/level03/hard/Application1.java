package com.hye.section01.array.level03.hard;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("홀수인 양의 정수를 입력하세요 : ");
        int n = sc.nextInt();
        if(n<0 || n%2==0){
            System.out.println("양수 혹은 홀수만 입력해야 합니다.");

        }else {
            for(int i = 1; i<=(n/2+1); i++){
                System.out.print(i);
            }

            for(int i = (n/2); i>=1; i--){
                System.out.print(i);
            }

    }

}}
