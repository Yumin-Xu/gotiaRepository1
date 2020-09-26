package cn.javabase.day08.demo03;

public class MyClass {
    int num;
    static int numStatic;

    public void method(){
        System.out.println("this is a normal member method");
        System.out.println(num);
        System.out.println(numStatic);
    }

    public static void methodStatic(){
        System.out.println("this is a static method");
        // System.out.println(num); error
        System.out.println(numStatic);
        // System.out.println(this); error
    }
}
