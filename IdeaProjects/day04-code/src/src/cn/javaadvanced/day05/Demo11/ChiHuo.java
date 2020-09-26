package cn.javaadvanced.day05.Demo11;

public class ChiHuo extends Thread{
    private BaoZi bz;
    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true){
            synchronized (bz){
                if(bz.flag == false){
                    try{
                        bz.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("ChiHuo is eating " + bz.pi + bz.xian + "BaoZi");
                bz.flag = false;
                bz.notify();
                System.out.println("ChiHuo has finished " + bz.pi + bz.xian + "BaoZi,BaoZiPu begin to make BaoZi");
                System.out.println("============================================");
            }
        }
    }
}
