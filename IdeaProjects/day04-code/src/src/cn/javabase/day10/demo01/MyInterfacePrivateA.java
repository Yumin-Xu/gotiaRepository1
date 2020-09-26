package cn.javabase.day10.demo01;

public interface MyInterfacePrivateA {
    public default void methodDefault1(){
        System.out.println("default method 1");
        methodCommon();
    }

    public default void methodDefault2(){
        System.out.println("default method 2");
        methodCommon();
    }

    private void methodCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
