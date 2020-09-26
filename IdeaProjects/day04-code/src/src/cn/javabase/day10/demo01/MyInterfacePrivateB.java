package cn.javabase.day10.demo01;

public interface MyInterfacePrivateB {
    public static void methodDefault1(){
        System.out.println("static method 1");
        methodStaticCommon();
    }

    public static void methodDefault2(){
        methodStaticCommon();
    }

    private static void methodStaticCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
