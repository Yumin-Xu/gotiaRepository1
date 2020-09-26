package cn.javabase.day07.demo01;

import java.util.Scanner;

public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (max > c) {
            System.out.println(max);
        } else {
            System.out.println(c);
        }
    }

}
