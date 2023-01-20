package ch09;

public class Main {

    public static void main(String[] args) {
        Sword s = new Sword();
        s.name = "Frame Brade";
        s.damage = 10;
        Hero h = new Hero("Taro");
        h.sword = s;
        System.out.println(h.sword.name);
        System.out.println("名前は" + h.name + "、HPは" + h.hp);
        Hero h2 = new Hero();
        System.out.println("名前は" + h2.name + "、HPは" + h2.hp);
    }

}
