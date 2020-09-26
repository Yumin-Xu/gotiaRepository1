package cn.javabase.day08.demo04;

public class Demo04MathPractice {
    public static void main(String[] args) {
        int count = 0;
        double min = -10.8;
        double max = 5.9;
        for(int i = (int) min ; i < max ; i++){
            int abs = Math.abs(i);
            if(abs > 6 || abs < 2){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
