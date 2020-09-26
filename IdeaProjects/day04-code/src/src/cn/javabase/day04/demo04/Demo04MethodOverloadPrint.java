package cn.javabase.day04.demo04;

public class Demo04MethodOverloadPrint {
    public static void main(String[] args) {
        myPrint(100);
        myPrint("Hello");
        myPrint(1.23);
        myPrint('A');
        myPrint(0);
        myPrint('d');
        myPrint("World is one world");
        myPrint("中文");
    }

    public static void myPrint(byte num){
        System.out.println(num);
    }

    public static void myPrint(short num){
        System.out.println(num);
    }

    public static void myPrint(int num){
        System.out.println(num);
    }

    public static void myPrint(long num){
        System.out.println(num);
    }

    public static void myPrint(float num){
        System.out.println(num);
    }

    public static void myPrint(double num){
        System.out.println(num);
    }

    public static void myPrint(char zifu){
        System.out.println(zifu);
    }

    public static void myPrint(String str){
        System.out.println(str);
    }

    public static void myPrint(boolean is){
        System.out.println(is);
    }
}
