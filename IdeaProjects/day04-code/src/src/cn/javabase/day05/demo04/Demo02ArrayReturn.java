package cn.javabase.day05.demo04;

public class Demo02ArrayReturn {
    public static void main(String[] args) {
        for (int i = 0; i < calculate(10,20,30).length; i++) {
            System.out.println(calculate(10,20,30)[i]);
        }
    }

    public  static int[] calculate(int a, int b, int c){
        int sum = a + b + c;
        int arg = sum / 3;
        int[] cal = {sum,arg};
        return cal;
    }
}
