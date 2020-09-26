package cn.javabase.day08.demo03;

public class Demo01StaticFiled {
    public static void main(String[] args) {
        Student one = new Student("Yumin",19);
        one.room = "101classroom";
        System.out.println(one.getName()
                + "," + one.getAge() + "," +  one.room
                + "," + one.getId());

        Student two = new Student("Go",17);
        System.out.println(two.getName() + ","
                +  two.getAge() + "," +  two.room
                + "," + two.getId());
    }
}
