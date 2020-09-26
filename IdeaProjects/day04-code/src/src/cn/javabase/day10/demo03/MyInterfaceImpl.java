package cn.javabase.day10.demo03;

public class MyInterfaceImpl implements MyInterface{
    @Override
    public void method() {
        System.out.println("method");
    }

    @Override
    public void methodA() {
        System.out.println("methodA");
    }

    @Override
    public void methodB() {
        System.out.println("methodB");
    }

    @Override
    public void methodCommon() {
        System.out.println("methodCommon");
    }
}
