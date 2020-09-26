package cn.javabase.day09.demo02;

public class Demo01ExtendsField {
    public static void main(String[] args) {
        Fu fu = new Fu();
        Zi zi = new Zi();

        System.out.println(fu.numFu);
        System.out.println(zi.numFu + zi.numZi);

        System.out.println(zi.num);

        zi.methodZi();
        zi.methodFu();
    }
}
