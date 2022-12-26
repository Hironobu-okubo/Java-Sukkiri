package ch08;

public class Main {

    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "taro";
        h.hp = 100;
        System.out.println("勇者" + h.name + "を生み出しました");
        h.sit(10);
        h.sleep();
        h.run();
        h.slip();
    }

}
