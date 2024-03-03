package com.ohgiraffers.project;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        System.out.print("사칙 연산을 선택하세요 (+, -, *, /,%): ");
        char operator = scanner.next().charAt(0);

        int result = 0;
        switch(operator) {

            case '%':
                result = num1 % num2;
                break;


            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else{ throw new IllegalArgumentException("0으로 나눌 수 없음");
                }
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                return;
        }

        System.out.println("결과: " + result);
    }
}







