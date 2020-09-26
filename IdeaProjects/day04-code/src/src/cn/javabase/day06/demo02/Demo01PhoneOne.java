package cn.javabase.day06.demo02;

public class Demo01PhoneOne {
    public static void main(String[] args) {
        Phone one = new Phone();

        one.brand = "Huawei";
        one.color = "Black";
        one.price = 5000;

        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);

        one.who("Yumin");
        one.send();
    }
}
