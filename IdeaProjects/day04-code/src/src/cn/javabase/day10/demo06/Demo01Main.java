package cn.javabase.day10.demo06;

public class Demo01Main {
    public static void main(String[] args) {
        Animal animal = new cat();
        animal.eat();

        //animal.catchMouse();
        cat cat= (cat) animal;
        cat.catchMouse();

        //Dog dog = (Dog) animal;
    }
}
