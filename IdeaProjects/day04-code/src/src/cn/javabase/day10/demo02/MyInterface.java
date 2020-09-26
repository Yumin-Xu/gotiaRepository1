package cn.javabase.day10.demo02;

public interface MyInterface {
    public default void method(){
        System.out.println("default method of interface");
    }
}
