package cn.javabase.day10.demo03;

public class Demo01Relations {
    public static void main(String[] args) {
        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.methodDefault();
        impl.method();
        impl.methodA();
        impl.methodB();
        impl.methodCommon();
    }
}
