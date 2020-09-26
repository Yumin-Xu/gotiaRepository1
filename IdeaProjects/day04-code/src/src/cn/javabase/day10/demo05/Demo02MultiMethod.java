package cn.javabase.day10.demo05;
/* member variable : compile look at left and run look at left */
/* member method : compile look at left and run look at right */
public class Demo02MultiMethod {
    public static void main(String[] args) {
        Fu obj = new Zi();

        obj.method();
        obj.methodFu();

        //obj.methodZi();
    }
}
