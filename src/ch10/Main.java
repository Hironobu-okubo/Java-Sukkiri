package ch10;

public class Main {

    public static void main(String[] args) {
        Hero h = new Hero();
        h.run();
        SuperHero sh = new SuperHero();
        sh.run();
        Matango m = new Matango('A');
        sh.attack(m);
        sh.fly();
        sh.attack(m);
    }

}
