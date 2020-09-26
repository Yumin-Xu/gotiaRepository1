package cn.javabase.day08.demo04;

import java.util.Arrays;

public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray = {10,20,30};
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);

        int[] intArray1 = {10,2,300,70,80,321};
        Arrays.sort(intArray1);
        System.out.println(Arrays.toString(intArray1));
    }
}
