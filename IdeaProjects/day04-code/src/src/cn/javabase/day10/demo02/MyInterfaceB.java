package cn.javabase.day10.demo02;

public interface MyInterfaceB {
    //static {}
    //public MyInterface(){}

    public abstract void methodB();

    public abstract void methodAbs();

    public default void methodDefault(){
        System.out.println("BBB");
    }
}
