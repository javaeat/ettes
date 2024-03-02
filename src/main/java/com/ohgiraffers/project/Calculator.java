package com.ohgiraffers.project;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력해주세요:");
        double num1 = scanner.nextDouble();

        System.out.print("두 번째 숫자를 입력해주세요:");
        double num2 = scanner.nextDouble();

        System.out.println("연산 기호를 선택해주세요 (+, -, *, /):");
        String operator = scanner.next();

        if (operator.equals("+")) {
            Plus a = new Plus();
            a.openPlus(num1, num2);
        } else {
            System.out.println("잘못된 연산 기호입니다... 다시 입력해주세요.");
        }
    }
}