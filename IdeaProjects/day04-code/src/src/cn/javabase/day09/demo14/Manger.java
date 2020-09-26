package cn.javabase.day09.demo14;

import java.util.ArrayList;

public class Manger extends User {
    public Manger(){
    }

    public Manger(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney,int count){
        ArrayList<Integer> redList = new ArrayList<>();
        int leftMoney = super.getMoney();
        if(totalMoney > leftMoney){
            System.out.println("Money isn't enough ! ");
            return redList;
        }

        super.setMoney(leftMoney - totalMoney);

        int avg = totalMoney / count;
        int mod = totalMoney % count;
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }
        int last = avg + mod;
        redList.add(last);

        return redList;
    }
}