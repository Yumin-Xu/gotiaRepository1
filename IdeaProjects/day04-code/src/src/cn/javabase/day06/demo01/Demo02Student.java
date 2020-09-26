package cn.javabase.day06.demo01;
// import cn.itcast.day06.demo01.Student;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu = new Student();

        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("=====================");

        stu.name = "Yumin";
        stu.age = 20;

        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("=====================");

        stu.eat();
        stu.sleep();
        stu.study();
    }
}
