package cn.javabase.day11.demo01;

public abstract class Fu {
    public final void method(){
        System.out.println("fu method work");
    }

    public abstract /* final */ void methodAbs();
}
