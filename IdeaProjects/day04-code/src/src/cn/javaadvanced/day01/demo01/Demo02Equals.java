package cn.javaadvanced.day01.demo01;

import java.util.Random;

public class Demo02Equals {
    public static void main(String[] args) {
        Person p1 = new Person("yumin",20);
        Person p2 = new Person("yumin",20);
        //Person p2 = new Person("gotia",21);

        //p1 = p2;
        System.out.println(p1);
        System.out.println(p2);

        Random r = new Random();

        boolean b = p1.equals(p2);
        boolean c = p1.equals(r);
        boolean d = p1.equals(null);
        boolean e = p1.equals(p1);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
