package cn.javabase.day07.demo05;

import java.util.ArrayList;

public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student();
        Student stu2 = new Student();
        Student stu3 = new Student();
        Student stu4 = new Student();

        stu1.setName("Abc");
        stu1.setAge(18);
        stu2.setName("Xu");
        stu2.setAge(19);
        stu3.setName("Def");
        stu3.setAge(20);
        stu4.setName("Yumin");
        stu4.setAge(21);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + "," + list.get(i).getAge());
        }


    }
}
