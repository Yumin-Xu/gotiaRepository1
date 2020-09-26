package cn.javabase.day11.demo03;

public class Outer {

    int num = 10;

    public class Inner{

        int num = 20;

        public void methodInner(){
            int num = 30;
            System.out.println(" inner class local variables is " + num);
            System.out.println(" inner class member variables is " + this.num);
            //System.out.println(super.num);
            System.out.println(" outer class member variables is " + Outer.this.num);
        }

    }
}
