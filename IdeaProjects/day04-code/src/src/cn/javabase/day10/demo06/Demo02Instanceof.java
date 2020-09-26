package cn.javabase.day10.demo06;

public class Demo02Instanceof {
    public static void main(String[] args) {
        Animal animal = new Dog();

        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }

        if(animal instanceof cat){
            cat cat = (cat) animal;
            cat.catchMouse();
        }

        giveMeAPet(new Dog());
    }

    public static void giveMeAPet(Animal animal){
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }

        if(animal instanceof cat){
            cat cat = (cat) animal;
            cat.catchMouse();
        }
    }
}
