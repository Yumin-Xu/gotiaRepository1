package cn.javabase.day06.demo03;

public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "Yumin";
        person.setAge(18);
        person.getAge();
        person.show();
    }
}
