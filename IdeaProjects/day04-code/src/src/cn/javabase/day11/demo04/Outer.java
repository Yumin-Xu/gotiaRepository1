package cn.javabase.day11.demo04;

public class Outer {

    public void methodOuter(){

        class Inner{
            int num = 10;
            public void methodInner(){
                System.out.println(num);
            }
        }
        Inner i = new Inner();
        i.methodInner();
    }
}
