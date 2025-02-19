package com.hye.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수 : ");
       int first =scanner.nextInt();

        System.out.print("두 번째 정수 : ");
        int second = scanner.nextInt();

        System.out.print("연산 기호를 입력하세요 : ");
         String operator = scanner.next();
    if(!(operator.equals("+") ||  operator.equals("-") || operator.equals("*") || operator.equals("/") ||operator.equals("%") ))
        {
        System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
    }
int result = 0;

switch(operator){
    case "+":
        result= first + second;
        break;
        case "-":
            result= first - second;
            break;
            case "*":
                result= first * second;
                break;
                case "/":
                    result= first / second;
                    break;
                    case "%":
                        result= first % second;
                        break;


}

        System.out.println(first + operator + second +"=" + result) ;





    }
}
