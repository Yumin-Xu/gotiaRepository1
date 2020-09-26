package cn.javabase.day10.demo06;

public class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }

    public void watchHouse(){
        System.out.println("dog watch house");
    }
}
