package cn.javabase.day09.demo14;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manger manger = new Manger("Boss",100);

        Member one = new Member("A",0);
        Member two = new Member("B",0);
        Member three = new Member("C",0);

        manger.show();
        one.show();
        two.show();
        three.show();
        System.out.println("========================");

        ArrayList<Integer> redList = manger.send(20,3);

        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manger.show();
        one.show();
        two.show();
        three.show();
        System.out.println("========================");
    }
}
