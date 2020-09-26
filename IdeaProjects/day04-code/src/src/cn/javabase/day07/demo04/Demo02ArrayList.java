package cn.javabase.day07.demo04;

import java.util.ArrayList;

public class Demo02ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        System.out.println(list);

        list.add("Yumin");
        System.out.println(list);

        list.add("begin");
        list.add("JAVA");
        list.add("study");
        list.add("computer");
        list.add("science");
        System.out.println(list);
    }
}
