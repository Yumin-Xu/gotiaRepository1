package cn.javabase.day10.demo07;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

        //Mouse mouse = new Mouse();
        //USB usbMouse = mouse;

        USB usbMouse = new Mouse();
        computer.useDevice(usbMouse);

        Keyboard keyboard = new Keyboard();
        computer.useDevice(keyboard);

        computer.useDevice(new Keyboard());

        computer.powerOff();
        System.out.println("=======================");

        method(10.0);
        method(20);
        int a = 30;
        method(a);
    }

    public static void method(double num){
        System.out.println(num);
    }
}
