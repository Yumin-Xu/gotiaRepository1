package cn.javabase.day11.demo02;

/*
*                                       public > protected > (default) > private
* in same class(Myself)                           yes        yes         yes        yes
* in same package(Neighborhood)                   yes        yes         yes        no
* subclass in different package(MySon)            yes        yes         no         no
* non-subclass in different package(Stranger)     yes        no          no         no
* */

public class MyClass {
    public int num = 10;

    public void method(){
        System.out.println(num);
    }
}
