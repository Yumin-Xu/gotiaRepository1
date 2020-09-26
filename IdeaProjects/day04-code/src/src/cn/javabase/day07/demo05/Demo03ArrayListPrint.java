package cn.javabase.day07.demo05;

import java.util.ArrayList;

public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("Yumin");
        list.add("gfeg");
        list.add("Xu");
        list.add("fjeogobngo");

        printArrayList(list);
    }

    public static void printArrayList(ArrayList<String > list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if(i == list.size() - 1){
                break;
            }else{
                System.out.print("@");
            }
        }
        System.out.println("}");
    }
}
