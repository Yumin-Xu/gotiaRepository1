package cn.javabase.day06.demo03;

public class Person {

    String name;
    private int age;

    public void show(){
        System.out.println("My name is " + name + " My age is " + age);
    }

    public void setAge(int num){
        if(num < 100 && num >= 1) {
            age = num;
        }else{
            System.out.println("Error");
        }
    }

    public int getAge(){
        return age;
    }
}
