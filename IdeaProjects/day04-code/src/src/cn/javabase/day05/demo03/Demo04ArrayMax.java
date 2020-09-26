package cn.javabase.day05.demo03;

public class Demo04ArrayMax {
    public static void main(String[] args) {
        int[] array = {5,15,30,10,-1,1000,10000,30,35,9999};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("The max number is " + max);
    }
}
