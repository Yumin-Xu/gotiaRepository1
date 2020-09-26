package cn.javabase.day07.demo04;

import java.util.ArrayList;

public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("YUmin");
        list.add("Xu");
        list.add("abv");
        list.add("dfffef");
        list.add("feefegdfgs");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
