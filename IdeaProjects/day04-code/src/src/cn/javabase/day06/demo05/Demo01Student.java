package cn.javabase.day06.demo05;

public class Demo01Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("Yumin");
        stu1.setAge(20);
        System.out.println(stu1.getName() + " , " + stu1.getAge());
        System.out.println("================");

        Student stu2 = new Student("Xu",21);
        System.out.println(stu2.getName() + " , " + stu2.getAge());
        stu2.setAge(22);
        System.out.println("=================");
        System.out.println(stu2.getName() + " , " + stu2.getAge());
    }
}
