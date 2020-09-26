package cn.javabase.day07.demo04;

import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Yumin");
        System.out.println(list);

        boolean success = list.add("Xu");
        System.out.println(list);
        System.out.println("if add successful " + success);

        list.add("abc");
        list.add("deffdf");
        list.add("fewafe");
        list.add("g");
        list.add("qwerrere");
        list.add("fjdioajfeijfidj");
        System.out.println(list);

        String s = list.get(3);
        System.out.println(s);

        String remove = list.remove(0);
        System.out.println(remove);
        System.out.println(list);

        int size = list.size();
        System.out.println(size);
    }
}
