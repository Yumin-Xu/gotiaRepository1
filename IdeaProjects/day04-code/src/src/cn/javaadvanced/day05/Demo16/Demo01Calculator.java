package cn.javaadvanced.day05.Demo16;

public class Demo01Calculator {
    public static void main(String[] args) {
        invokeCalc(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });

        invokeCalc(10,20,(int a, int b) -> {
            return a + b;
        });

        invokeCalc(10,20,(a,b) -> a + b);

    }

    public static void invokeCalc(int a, int b, Calculator c){
        int sum = c.calc(a,b);
        System.out.println(sum);
    }

}
