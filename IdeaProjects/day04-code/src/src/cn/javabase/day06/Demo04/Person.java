package cn.javabase.day06.Demo04;

public class Person {
    String name;

    public void sayHello(String name){
        System.out.println(name + " Hello,I am " + this.name);
        System.out.println(this);
    }
}
