package cn.javabase.day07.demo03;

import java.util.Random;
import java.util.Scanner;

public class Demo04RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Please enter the number you gussed : ");
            int gussNum = sc.nextInt();

            if(gussNum > randomNum){
                System.out.println("too large,please try again ");
            }else if(gussNum < randomNum){
                System.out.println("too small,please try again");
            }else{
                System.out.println("congratulation ! You are RIGHT ! ");
                break;
            }
        }
        System.out.println("Game Over!");
    }
}
