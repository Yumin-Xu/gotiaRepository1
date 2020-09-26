package cn.javaadvanced.day05.Demo15;

import java.util.Arrays;
import java.util.Comparator;

public class Demo01Array {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("yumin",19),
                new Person("gotia",20),
                new Person("liwen",21)
        };

        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        for (Person p : arr) {
            System.out.println(p);
        }

        Arrays.sort(arr,(Person o1,Person o2) -> {
            return  o1.getAge() - o2.getAge();
        });

        for (Person p : arr) {
            System.out.println(p);
        }

        Arrays.sort(arr,(o1,o2) -> o1.getAge() - o2.getAge());

        for (Person p : arr) {
            System.out.println(p);
        }

    }
}
