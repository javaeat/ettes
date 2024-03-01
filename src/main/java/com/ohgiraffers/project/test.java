package com.ohgiraffers.project;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수를 입력해주세요 : ");
        int first = sc.nextInt();
        System.out.print("두번째 정수를 입력해주세요 : ");
        int second = sc.nextInt();
        System.out.print("연산 기호를 입력해주세요 : ");
        char op = sc.next().charAt(0);

        int result = 0;
        switch (op){
            case '/' :
                result = first / second;
                break;
            case '%' :
                result = first % second;
                break;
        }

        System.out.println(first + " " + op + " " + second + " = " + result);


    }
}