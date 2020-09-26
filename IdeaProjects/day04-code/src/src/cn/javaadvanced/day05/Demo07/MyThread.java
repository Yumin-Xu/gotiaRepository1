package cn.javaadvanced.day05.Demo07;

public class MyThread extends Thread{
    @Override
    public void run() {
        //String name = getName();
        //System.out.println(name);

        //Thread t = Thread.currentThread();
        //System.out.println(t);

        //String name = t.getName();
        //System.out.println(name);

        System.out.println(Thread.currentThread().getName());
    }
}
