package cn.javabase.day08.demo02;

public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        char[] charArray = {'H','e','l','l','o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str3.equals("Hello"));
        System.out.println("Hello".equals(str3));

        String strA = "JAVA";
        String strB = "java";
        System.out.println(strA.equals(strB));
        System.out.println(strA.equalsIgnoreCase(strB));

        String str4 = null;
        System.out.println("Hello".equals(str4));
        System.out.println(str4.equals("Hello"));
    }
}
