package cn.javabase.day07.demo04;

import java.util.ArrayList;

public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<>();
        listA.add(100);
        System.out.println(listA);

        Integer integer = listA.get(0);
        System.out.println(integer);
    }
}
