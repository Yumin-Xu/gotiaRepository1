package cn.javabase.day07.demo02;

public class Demo01Anonymous {
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "Yumin";
        one.showName();

        new Person().name = "Xu";
        new Person().showName();
    }
}
