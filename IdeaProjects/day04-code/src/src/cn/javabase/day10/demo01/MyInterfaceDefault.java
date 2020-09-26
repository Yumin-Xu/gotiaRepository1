package cn.javabase.day10.demo01;

public interface MyInterfaceDefault {
    public abstract void methodAbs();
    public default void methodDefault(){
        System.out.println("new default method");
    }
}
