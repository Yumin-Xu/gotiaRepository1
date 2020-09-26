package cn.javabase.day05.demo03;

public class Demo07ArrayReverse {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("===========================");

        for (int min = 0,max = array.length - 1; min < max; min++,max--) {
                int loaf = array[min];
                array[min] = array[max];
                array[max] = loaf;
            }
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }

