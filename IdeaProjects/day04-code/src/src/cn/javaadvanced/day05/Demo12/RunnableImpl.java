package cn.javaadvanced.day05.Demo12;

public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "create a new process and execute");
    }
}
