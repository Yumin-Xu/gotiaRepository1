package cn.javabase.day04.demo02;

public class Demo02MethodDefine {
    public static void main(String[] args) {
        sum(10,20);
        System.out.println("====================");
        System.out.println(sum(10,20));
        System.out.println("====================");
        int num = sum(20,20);
        num += 60;
        System.out.println(num);
    }

    public static int sum(int a,int b){
        System.out.println("started");
        int result = a + b;
        return result;
    }
}
