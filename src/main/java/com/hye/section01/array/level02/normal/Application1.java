package com.hye.section01.array.level02.normal;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 하나 입력하세요 : ");
        String word = sc.nextLine();

        System.out.print("검색할 문자를 입력하세요 : ");
        String string = sc.nextLine();

        char[] carr = word.toCharArray();
        int sum = 0;

        for(int i = 0; i<word.length();i++){
            if(carr[i]==string.charAt(0)){
                sum++;
            }

//            word.toCharArray(i).equals(string);
        }
        System.out.println("입력하신 문자열 " + word +"에서 찾으시는 문자 " + string + "은 " + sum + "개 입니다." );

    }
}
