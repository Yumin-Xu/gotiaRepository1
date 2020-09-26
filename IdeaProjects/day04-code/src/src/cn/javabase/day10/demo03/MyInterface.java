package cn.javabase.day10.demo03;

public interface MyInterface extends MyInterfaceA,MyInterfaceB{
    public abstract void method();

    @Override
    default void methodDefault() {
        System.out.println("CCC");
    }
}
