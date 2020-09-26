package cn.javabase.day11.demo08;

import cn.javabase.day11.red.OpenMode;

public class Bootstrap {
    public static void main(String[] args) {
        MyRed red = new MyRed("I am lucky");
        red.setOwnerName("yumin");

        //OpenMode normal = new NormalMode();
        //red.setOpenWay(normal);

        OpenMode random = new RandomMode();
        red.setOpenWay(random);
    }
}
