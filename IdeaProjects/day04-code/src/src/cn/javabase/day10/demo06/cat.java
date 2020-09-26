package cn.javabase.day10.demo06;

public class cat extends Animal{
    @Override
    public void eat() {
        System.out.println("cat eat fish");
    }

    public void catchMouse(){
        System.out.println("cat catch mouse");
    }
}
