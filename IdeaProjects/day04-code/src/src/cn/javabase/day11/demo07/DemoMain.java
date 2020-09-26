package cn.javabase.day11.demo07;

public class DemoMain {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("yumin");

        //hero.setSkill(new SkillImpl());

        //Skill skill = new Skill() {
        //    @Override
        //    public void use() {
        //        System.out.println("pa pa pa");
        //    }
        //};
        //hero.setSkill(skill);

        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("da da da");
            }
        });

        hero.attack();
    }
}
