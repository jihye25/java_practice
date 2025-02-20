package com.hye.section01.array.level04.advanced;

import java.util.Arrays;
import java.util.Random;

public class Application1 {
    public static void main(String[] args) {

        Random random=new Random();

        int[] arr=new int [6];
        int count =0;

        while (count<6){
            int randomNumber=random.nextInt(45)+1;

            boolean isDuplicate = false;

        for(int i=0;i<6;i++){
            if(arr[i]==randomNumber) {
                isDuplicate=true;
               break;}}
            {if(!isDuplicate){
            arr[count]=randomNumber;
            count++;}
            }}

            Arrays.sort(arr);

        for(int i=0;i<6;i++){
        System.out.print(arr[i] + " ");
    }}}
