package cn.javaadvanced.day05.Demo13;

public class Demo02Lambda {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " new thread created");
            }
        }).start();

        new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " new thread created");
            }).start();

        new Thread(() -> System.out.println(Thread.currentThread().getName() + " new thread created")).start();
    }
}
