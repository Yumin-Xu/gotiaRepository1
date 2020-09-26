package cn.javabase.day07.demo01;

import java.util.Scanner;

public class Demo01Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("the number is " + num);
        System.out.println("================");
        String str = sc.next();
        System.out.println("the string is " + str);
    }
}
