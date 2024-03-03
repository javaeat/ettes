package com.ohgiraffers.project;

import java.util.Scanner;

public class Plus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력해주세요:");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력해주세요:");
        int num2 = scanner.nextInt();

        System.out.println("연산 기호를 선택해주세요 (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        int result = 0;

        switch (operator) {

            case '+':
                result = num1 + num2;
                break;

            default:
                System.out.println("잘못된 연산 기호입니다...");
                return;
        }

        System.out.println("결과: " + result);

    }
}
