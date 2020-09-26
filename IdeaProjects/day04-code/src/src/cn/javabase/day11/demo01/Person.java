package cn.javabase.day11.demo01;

public class Person {
    /* private final String name; */
    /* private final String name = "aaa"; */

    private final String name;

    public Person() {
        name = "aaa";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // public void setName(String name) {
    //     this.name = name;
    // }
}
