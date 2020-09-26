package cn.javabase.day06.Demo04;

public class Student {

    private String name;
    private int age;

    public Student(){
        System.out.println("no paraments");
    }

    public Student(String name,int age){
        System.out.println("exist paraments");
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

}
