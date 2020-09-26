package cn.javabase.day07.demo03;

import java.util.Random;

public class Demo03Random {
    public static void main(String[] args) {
        int num = 5;
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            int result = r.nextInt(num) + 1;
            System.out.println(result);
        }
    }
}
