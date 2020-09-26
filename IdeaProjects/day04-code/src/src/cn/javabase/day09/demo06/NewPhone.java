package cn.javabase.day09.demo06;

public class NewPhone extends Phone{
    @Override
    public void show() {
        super.show();
        System.out.println("Show name");
        System.out.println("Show person photo");
    }
}
