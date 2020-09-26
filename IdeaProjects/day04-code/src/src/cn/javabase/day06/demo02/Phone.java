package cn.javabase.day06.demo02;

public class Phone {

    String brand;
    double price;
    String color;

    public void who(String who){
        System.out.println("Call" + who);
    }

    public void send(){
        System.out.println("Send to all people");
    }

}
