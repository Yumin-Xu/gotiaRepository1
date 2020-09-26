package cn.javabase.day11.demo06;

public class DemoMain {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("yumin");
        hero.setAge(20);

        Weapon weapon = new Weapon();
        weapon.setCode("machine gun");

        hero.setWeapon(weapon);
        hero.attack();
    }
}
