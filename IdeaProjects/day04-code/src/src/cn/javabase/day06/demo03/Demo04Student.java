package cn.javabase.day06.demo03;

public class Demo04Student {
    public static void main(String[] args) {
        Student stu = new Student();

        stu.setName("Yumin");
        stu.setAge(18);
        stu.setMale(true);

        System.out.println("Name is " + stu.getName());
        System.out.println("Age is " + stu.getAge());
        System.out.println("Sexual is " + stu.isMale());

    }
}
