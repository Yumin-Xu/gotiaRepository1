package cn.javabase.day10.demo02;

public class MyInterfaceImpl /* extends Object */ implements MyInterfaceA , MyInterfaceB{
    @Override
    public void methodA() {
        System.out.println("override methodA");
    }

    @Override
    public void methodAbs() {
        System.out.println("override methodAbs which interface A and B both have");
    }

    @Override
    public void methodB() {
        System.out.println("override methodB");
    }

    @Override
    public void methodDefault(){
        System.out.println("override conflict default method in interface A and B");
    }
}
