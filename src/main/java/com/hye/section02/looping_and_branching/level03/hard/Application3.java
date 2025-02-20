package com.hye.section02.looping_and_branching.level03.hard;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String a = sc.nextLine();

        int i =0;
        if(a.charAt(i)>='a' && a.charAt(i)<='z'&& a.charAt(i)>='A' && a.charAt(i)<='Z'){
            System.out.println("영문자가 아닌 문자가 포함되어 있습니다.");
        }

        System.out.print("문자 입력 : ");
        String b = sc.nextLine();




        int sum = 0;

        for(i=0;i<a.length();i++){
            for(int j =0;j<b.length();j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    sum += 1;
                }

            }


        }
        System.out.println( " 포함된 갯수 : " + sum + "개");

    }

}
