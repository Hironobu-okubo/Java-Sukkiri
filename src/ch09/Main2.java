package ch09;

public class Main2 {

    public static void main(String[] args) {
        Hero h1 = new Hero("Taro");
        Hero h2 = new Hero("Jiro");
        Wizard w = new Wizard();
        w.name = "Wich";
        w.hp = 50;
        w.heal(h1);
        w.heal(h1);
        w.heal(h2);
    }

}
