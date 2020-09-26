package cn.javabase.day10.demo02;

public interface MyInterfaceA {
    //static {}
    //public MyInterface(){}

    public abstract void methodA();

    public abstract void methodAbs();

    public default void methodDefault(){
        System.out.println("AAA");
    }
}
