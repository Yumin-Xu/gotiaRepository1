package cn.javaadvanced.day05.Demo07;

public class Demo01GetThreadName {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();

        new MyThread().start();
        new MyThread().start();

        System.out.println(Thread.currentThread().getName());
    }
}
