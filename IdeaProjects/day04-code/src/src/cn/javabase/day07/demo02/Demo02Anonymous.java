package cn.javabase.day07.demo02;

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int num = sc.nextInt();

        //int num = new Scanner(System.in).nextInt();
        //System.out.println("the number is " + num);

        //Scanner sc = new Scanner(System.in);
        //methodParam(sc);

        methodParam(new Scanner(System.in));
        System.out.println(methodReturn().nextInt());
    }

    public static void methodParam(Scanner sc){
        int i = sc.nextInt();
        System.out.println("number is " + i);
    }

    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }
}
