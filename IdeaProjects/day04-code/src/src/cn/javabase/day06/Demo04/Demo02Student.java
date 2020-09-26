package cn.javabase.day06.Demo04;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        System.out.println("=================");
        Student stu2 = new Student("yumin",5);
        System.out.println(stu2.getName() + stu2.getAge());
        stu2.setAge(20);
        System.out.println(stu2.getName() + stu2.getAge());
    }

}
