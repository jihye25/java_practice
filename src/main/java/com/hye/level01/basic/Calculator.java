package com.hye.level01.basic;

public class Calculator {


    public void sum1to10(){
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum += i;
        }
        System.out.println("1부터 10까지의 합 : " + sum);
    }

    public void checkMaxNumber(int a, int b){
        if(a > b){
            System.out.println("두 수 중 큰 수는 " + a + "이다.");
        } else {
            System.out.println("두 수 중 큰 수는 "+ b + "이다.");
        }
    }

    public static int sumTwoNumber(int a, int b){
        return a+b;
    }

    public static int minusTwoNumber(int a, int b){
        return a-b;
    }

}
