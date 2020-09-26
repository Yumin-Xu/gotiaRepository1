package cn.javabase.day11.demo04;

public class MyOuter {
    public void methodOuter(){
        final int num = 10;
        class MyInner{
            public void methodInner(){
                System.out.println(num);
            }
        }
    }
}
