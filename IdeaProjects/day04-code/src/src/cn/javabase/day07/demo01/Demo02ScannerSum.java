package cn.javabase.day07.demo01;

import java.util.Scanner;

public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int num1 = num.nextInt();
        int num2 = num.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum is " + sum);


    }
}
