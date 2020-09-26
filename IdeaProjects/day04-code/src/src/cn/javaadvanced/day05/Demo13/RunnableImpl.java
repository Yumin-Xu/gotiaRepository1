package cn.javaadvanced.day05.Demo13;

public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " new thread created");
    }
}
