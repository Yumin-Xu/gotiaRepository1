package cn.javabase.day08.demo02;

public class Demo06Practise {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};

        String result = formArrayToString(array);
        System.out.println(result);
    }

    public static String formArrayToString(int[] array){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if(i == array.length - 1){
                str += "word" + array[i] + "]";
            }else{
                str += "word" + array[i] + "#";
            }
        }
        return str;
    }
}
