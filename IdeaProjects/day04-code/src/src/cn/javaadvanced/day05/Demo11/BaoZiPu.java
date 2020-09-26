package cn.javaadvanced.day05.Demo11;

public class BaoZiPu extends Thread{
    private BaoZi bz;

    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;

        while (true){
            synchronized (bz){
                if(bz.flag == true){
                    try{
                        bz.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                if(count%2 == 0){
                    bz.pi = "BaoPi";
                    bz.xian = "SanXian";
                }else{
                    bz.pi = "BinPi";
                    bz.xian = "NiuRou";
                }
                count++;
                System.out.println("BaoZiPu is working on " + bz.pi + bz.xian + "BaoZi");

                try{
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                bz.flag = true;

                bz.notify();
                System.out.println("BaoZi was done : " + bz.pi + bz.xian + "BaoZi,ChiHuo can begin to eat");
            }
        }
    }
}
