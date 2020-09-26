package cn.javabase.day11.demo03;

public class Body {
    public class Heart{
        public void beat(){
            System.out.println("heart boom boom boom");
            System.out.println(name);
        }
    }

    private String name;

    public void methodBody(){
        System.out.println("out class method");
        Heart heart = new Heart();
        heart.beat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
