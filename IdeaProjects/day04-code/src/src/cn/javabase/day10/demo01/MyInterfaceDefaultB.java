package cn.javabase.day10.demo01;

public class MyInterfaceDefaultB implements MyInterfaceDefault{
    @Override
    public void methodAbs() {
        System.out.println("abstract method BBB");
    }

    @Override
    public void methodDefault() {
        System.out.println("classB override default method");
    }
}
