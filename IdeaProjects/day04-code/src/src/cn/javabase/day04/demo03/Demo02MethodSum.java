package cn.javabase.day04.demo03;

public class Demo02MethodSum {
    public static void main(String[] args) {
        System.out.println("Result is "+ getSum());
    }

    public  static  int getSum(){
        int sum = 0 ;
        for (int i = 1; i <= 10900000; i++) {

            sum += i;
            
        }
        return  sum;
    }
}
