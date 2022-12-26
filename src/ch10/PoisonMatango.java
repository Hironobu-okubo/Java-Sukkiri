package ch10;

public class PoisonMatango extends Matango {

    int countAtaack = 5;

    public PoisonMatango(char suffix){
        super(suffix);
    }

    public void attack(Hero h){
        super.attack(h);
        if(this.countAtaack != 0){
            System.out.println("さらに毒の胞子をばらまいた");
            System.out.println(this.hp / 5 + "ポイントのダメージ");
            this.hp -= this.hp / 5;
            this.countAtaack--;
        }
    }
}
