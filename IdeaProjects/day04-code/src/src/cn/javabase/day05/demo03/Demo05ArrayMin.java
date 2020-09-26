package cn.javabase.day05.demo03;

public class Demo05ArrayMin {
    public static void main(String[] args) {
        int[] array = {5,15,30,10,-1,1000,10000,30,35,9999};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("The minimum number is " + min);
    }
}
