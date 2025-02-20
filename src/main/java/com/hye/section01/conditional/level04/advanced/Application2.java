package com.hye.section01.conditional.level04.advanced;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("월 급여 입력 : ");
        long salary = scanner.nextLong();
        System.out.print("매출액 입력 : ");
        long sale = scanner.nextLong();

        double bonus=0;

        if(sale>= 50000000){
            bonus=0.05;
        } else if (sale>=30000000) {
            bonus = 0.03;

        }else if(sale >=10000000) {
            bonus = 0.01;
        } else {bonus = 0;}

        long total = (long)(salary + (sale*bonus));

        System.out.println("매출액 : " + sale );
        System.out.println("보너스율 : " + (int)(bonus*100) + "%" );
        System.out.println("월 급여 : " + salary);
        System.out.println("보너스 금액 : " + sale*bonus);

        System.out.println("총 급여 : " + total );
    }
}
