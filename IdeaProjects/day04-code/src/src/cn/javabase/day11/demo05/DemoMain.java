package cn.javabase.day11.demo05;

public class DemoMain {
    public static void main(String[] args) {
        //MyInterface obj = new MyInterfaceImpl();
        //obj.method();

        MyInterface objA = new MyInterface() {
            @Override
            public void method1() {
                System.out.println("Anonymous inner class implement method 111a");
            }

            @Override
            public void method2() {
                System.out.println("Anonymous inner class implement method 222a");
            }
        };
        objA.method1();
        objA.method2();

        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("Anonymous inner class implement method 111b");
            }

            @Override
            public void method2() {
                System.out.println("Anonymous inner class implement method 222b");
            }
        }.method1();

        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("Anonymous inner class implement method 111b");
            }

            @Override
            public void method2() {
                System.out.println("Anonymous inner class implement method 222b");
            }
        }.method2();
    }
}
