package com.ohgiraffers.project;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 숫자 입력 받기
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        // 연산자 입력 받기
        System.out.print("연산자를 입력하세요 (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        int result = 0;

        // 연산 수행
        switch (operator) {

            case '-':
                result = num1 - num2;
                break;

            default:
                System.out.println("잘못된 연산자입니다.");
                return;
        }

        // 결과 출력
        System.out.println("결과: " + result);
    }
}