package com.ohgiraffers.multiple;

import java.util.Scanner;

public class Multiple {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("곱하기 프로그램 작동 중");
        System.out.print("첫 번째 정수를 입력하시오 : ");
        int first = sc.nextInt();

        System.out.print("두 번째 정수를 입력하시오 : ");
        int second = sc.nextInt();

    Calculator calc = new Calculator();
    int multi = calc.calc(first, second);
    System.out.println("두 수를 곱한 결과는 " + multi + "입니다.");

    }

}
