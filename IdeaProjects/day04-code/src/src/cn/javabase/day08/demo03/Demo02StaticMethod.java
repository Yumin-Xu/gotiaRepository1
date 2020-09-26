package cn.javabase.day08.demo03;

public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.method();
        obj.methodStatic(); // not recommend
        MyClass.methodStatic();// recommend

        myMethod();
    }

    public static void myMethod(){
        System.out.println("own method");
    }
}
