package ch09;

public class Hero {
    String name;
    int hp;
    Sword sword;

    public Hero(String name){
        this.hp = 100;
        this.name = name;
    }

    public Hero(){
        this("Dummy");
    }

    public void attack(){
        System.out.println(this.name + "は攻撃した");
    }
}
