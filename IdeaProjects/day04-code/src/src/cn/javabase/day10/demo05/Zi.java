package cn.javabase.day10.demo05;

public class Zi extends Fu{
    int num = 20;
    int age = 16;

    @Override
    public void showNum() {
        System.out.println(num);
    }

    @Override
    public void method(){
        System.out.println("Zi method");
    }

    public void methodZi(){
        System.out.println("special method zi");
    }
}
