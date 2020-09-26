package cn.javaadvanced.day05.Demo11;

public class Demo {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();

        new BaoZiPu(bz).start();

        new ChiHuo(bz).start();
    }
}
