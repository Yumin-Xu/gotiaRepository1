package cn.javabase.day05.demo01;

public class Demo05Array {
    public static void main(String[] args) {
        int[] array = new int[3];
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        array[1] = 123;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}
