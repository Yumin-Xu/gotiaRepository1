package cn.javabase.day07.demo04;

public class Demo01Array {
    public static void main(String[] args) {
        Person[] array = new Person[3];

        Person one = new Person("Yumin",18);
        Person two = new Person("Xu",19);
        Person three = new Person("Min",20);

        array[0] = one;
        array[1] = two;
        array[2] = three;

        for (int i = 0; i < 3; i++) {
            System.out.println(array[i].getName());
            System.out.println(array[i].getAge());
        }

    }
}
