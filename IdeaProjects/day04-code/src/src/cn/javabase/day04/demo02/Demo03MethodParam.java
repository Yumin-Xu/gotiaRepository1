package cn.javabase.day04.demo02;

public class Demo03MethodParam {
    public static void main(String[] args) {
        method1(10,29);
        method2();
    }

    public static  void method1(int a , int b){
        int result = a * b;
        System.out.println("The result is " + result);
    }

    public  static void method2(){
        for(int i = 0 ; i < 10 ; i++){
            System.out.println("Hello World " + i );
        }
    }
}
