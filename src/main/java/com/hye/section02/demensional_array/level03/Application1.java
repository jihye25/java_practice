package com.hye.section02.demensional_array.level03;

import java.util.Random;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("가로 행의 수를 입력하세요 : ");
        int width  = sc.nextInt();
        System.out.print("세로 열의 수를 입력하세요 : ");
        int height = sc.nextInt();

char[][] array = new char[width][height];

        if(width>0 && height>0 && width<=10 && height<=10){
            Random rand = new Random();


            for(int i=0;i<width;i++){
                for(int j=0;j<height;j++){
                    char randomChar = (char) ('A' + (rand.nextInt(26)));
                array[i][j]=randomChar;
                }
            }
            for(int i=0;i<width;i++){
                for(int j=0;j<height;j++){
                    System.out.print(array[i][j]+" ");


                }
                System.out.println(); }} else {
            System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
        }
    }
}
