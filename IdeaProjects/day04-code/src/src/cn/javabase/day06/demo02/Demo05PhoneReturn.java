package cn.javabase.day06.demo02;

public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone get = getPhone();
        System.out.println(get.price);
        System.out.println(get.color);
        System.out.println(get.brand);
    }

    public static Phone getPhone(){
        Phone one = new Phone();

        one.brand = "Huawei";
        one.color = "Black";
        one.price = 5000;

        return one;
    }
}
