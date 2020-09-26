package cn.javabase.day10.demo07;

public class Computer {
    public void powerOn(){
        System.out.println("computer power on");
    }

    public void powerOff(){
        System.out.println("computer power off");
    }

    public void useDevice(USB usb){
        usb.open();
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }else if(usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        }
        usb.close();
    }
}
