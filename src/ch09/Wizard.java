package ch09;

public class Wizard {
    String name;
    int hp;
    public void heal(Hero h){
        h.hp += 10;
        System.out.println(h.name + "のHPは10回復して" + h.hp + "になった");
    }
}
