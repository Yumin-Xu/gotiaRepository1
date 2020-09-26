package cn.javaadvanced.day06.demo01;

import java.io.File;

public class Demo01File {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);

        System.out.println(File.separator);
    }
}
