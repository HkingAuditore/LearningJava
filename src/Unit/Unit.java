package Unit;
public class Unit {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("set name : " + this.name);
    }

    String name = "unNamed";
    protected float hp;
    float speed;

    public static String copyRight;

    static{
        copyRight = "Hking Inc.";

    }

    public Unit() {
        this.setName("New Unit");
    }

    public Unit(String name, float hp, float speed) {
        this.setName(name);
        this.hp = hp;
        this.speed = speed;
    }


}
