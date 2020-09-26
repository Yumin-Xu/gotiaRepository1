package cn.javaadvanced.day01.demo01;

import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "aaa";
        String s3 = "abc";
        String s4 = null;

        boolean b = s1.equals(s2);
        boolean c = s1.equals(s3);
        System.out.println(b);
        System.out.println(c);

        //boolean d = s1.equals(s4);
        //System.out.println(d);

        boolean e = Objects.equals(s1, s4);
        System.out.println(e);
    }
}
