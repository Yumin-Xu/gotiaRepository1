package cn.javabase.day04.demo03;

public class Demo03MethodPrit {
    public static void main(String[] args) {
        printCount(20);
    }

    public static void printCount(int num){
        for (int i = 1; i <= num; i++) {
            System.out.println("Hello World ! "+ i);
        }
    }
}
