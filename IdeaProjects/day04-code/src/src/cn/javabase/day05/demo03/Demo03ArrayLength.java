package cn.javabase.day05.demo03;

public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];

        int[] arrayB  ={10,20,30,4,5,6,7,78,8,6,7,67,76,76,43,100,750,5,6,7,78,8,6,7,67,76};
        int len = arrayB.length;
        System.out.println("length of arrayB is " + len);

        int[] arrayC = new int[3];
        System.out.println(arrayC.length);

        arrayC = new int[9];
        System.out.println(arrayC.length);
    }
}
