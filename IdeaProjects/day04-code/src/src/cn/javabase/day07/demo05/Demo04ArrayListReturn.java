package cn.javabase.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(100) + 1);
        }

        System.out.println(getSmallList(list));
        System.out.println(getSmallList(list).size());
    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> list){
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0){
                list1.add(list.get(i));
            }
        }
        return list1;
    }
}
