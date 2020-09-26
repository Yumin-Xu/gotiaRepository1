package cn.javaadvanced.day05.Demo06;

public class Demo01Thread {
    public static void main(String[] args) {
        MyThread my = new MyThread();

        my.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main : " + i);
        }
    }
}
