package cn.javabase.day10.demo01;

public class Demo03Interface {
    public static void main(String[] args) {
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();

        // impl.methodStatic();
        MyInterfaceStatic.methodStatic();
    }
}
