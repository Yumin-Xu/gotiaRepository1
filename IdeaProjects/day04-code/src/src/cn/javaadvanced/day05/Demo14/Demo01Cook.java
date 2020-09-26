package cn.javaadvanced.day05.Demo14;

public class Demo01Cook {
    public static void main(String[] args) {
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("Let's eat");
            }
        });

        invokeCook(() -> {
            System.out.println("Let's eat");
        });

        invokeCook(() -> System.out.println("Let's eat"));
    }

    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
