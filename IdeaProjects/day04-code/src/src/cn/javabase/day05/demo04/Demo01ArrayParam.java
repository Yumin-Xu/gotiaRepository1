package cn.javabase.day05.demo04;

public class Demo01ArrayParam {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};

        out(array);
        out(array);
        out(array);
        out(array);
    }

    public static void out(int[] array){
        System.out.println(array);
        for(int i = 0;i < array.length;i++){
            System.out.println(array[i]);
        }
    }

}
