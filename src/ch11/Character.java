package ch11;

import ch10.Matango;

public abstract class Character {
    String name;
    int hp;

    public void run(){
        System.out.println(this.name + "は逃げ出した");
    }

    public abstract void attack(Matango m);
}
