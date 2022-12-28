package ch11;

import ch10.Matango;

public class Dancer extends Character {

    public void attack(Matango m){
        System.out.println(this.name + "の攻撃");
        System.out.println("敵に３ポイントのダメージ");
//        m.hp -= 3;
    }
}
