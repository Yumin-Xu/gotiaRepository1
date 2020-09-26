package cn.javabase.day04.demo04;

public class Demo01MethodOverload {
    public static void main(String[] args) {
        printSpace();
        System.out.println(sum(10,20));
        printSpace();
        System.out.println(sum(10,20,30));
        printSpace();
        System.out.println(sum(10,20,30,40));
        printSpace();
        System.out.println(sum(10,20,30,40,50));
        printSpace();
    }

    public static int sum(int a,int b){
        System.out.println("Two Parameters");
        return a + b;
    }

    public static int sum(int a,int b,int c){
        System.out.println("Three Parameters");
        return a + b + c;
    }

    public static int sum(int a,int b,int c , int d){
        System.out.println("Four Parameters");
        return a + b + c + d;
    }

    public static int sum(int a,int b,int c,int d,int e){
        System.out.println("Five Parameters");
        return a + b + c + d + e;
    }

    public static void printSpace(){
        System.out.println("=====================");
    }

}
