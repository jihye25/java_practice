package com.hye.level01.basic;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum1to10();

        calculator.checkMaxNumber(10,20);

        calculator.sumTwoNumber(10,20);
        System.out.println("10과 20의 합은 : " + calculator.sumTwoNumber(10,20));

        calculator.minusTwoNumber(10,5);
        System.out.println("10과 5의 차는 : " + calculator.minusTwoNumber(10,5));

    }


}
