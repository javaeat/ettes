package com.ohgiraffers.project;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수를 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두번째 정수를 입력해주세요 : ");
        int num2 = sc.nextInt();
        System.out.print("연산 기호를 입력해주세요 : ");
        char operator = sc.next().charAt(0);

        int result = 0;
        switch(operator) {
            case '+':
                result = num1 + num2;
        }

        System.out.println("결과: " + result);
    }
}