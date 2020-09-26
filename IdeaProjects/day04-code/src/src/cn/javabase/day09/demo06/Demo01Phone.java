package cn.javabase.day09.demo06;

public class Demo01Phone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        NewPhone newPhone = new NewPhone();

        phone.call();
        phone.send();
        phone.show();

        newPhone.show();
        newPhone.call();
        newPhone.send();
    }
}
