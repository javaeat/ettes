package com.ohgiraffers.project;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력해주세요 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수를 입력해주세요 : ");
        int second = sc.nextInt();
        System.out.print("연산 기호 입력(+, -, *, /, %) : ");
        char op = sc.next().charAt(0);

        int result = 0;

        switch (op) {

            case '*' :
                result = first * second;
                break;

            default:
                System.out.println("잘못된 연산기호 입니다.");
                return;
        }

        System.out.println(first + " " + op + " " + second + " = " + result);



    }
}



