package cn.javabase.day04.demo04;

public class Demo02MethodOverloadSame {
    public static void main(String[] args) {
        printSpace();
        byte a=10;
        byte b=20;
        System.out.println(isSame(a,b));
        printSpace();
        short c=10;
        short d=10;
        System.out.println(isSame(c,d));
        printSpace();
        int e=30;
        int f=20;
        System.out.println(isSame(e,f));
        printSpace();
        long g=20;
        long h=20;
        System.out.println(isSame(g,h));
        printSpace();
    }

    public static boolean isSame(int a, int b){
        System.out.println("Two int parameter");
        return a == b;
    }

    public static boolean isSame(long a, long b){
        System.out.println("Two long parameter");
        if(a == b){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isSame(short a, short b){
        System.out.println("Two short parameter");
        boolean same = a == b ? true : false;
        return same;
    }

    public static boolean isSame(byte a, byte b){
        System.out.println("Two byte parameter");
        boolean same;
        if(a == b){
            same = true;
        }else{
            same = false;
        }
        return same;
    }

    public static void printSpace(){
        System.out.println("===================");
    }
}
