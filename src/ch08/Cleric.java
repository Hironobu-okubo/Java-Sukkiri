package ch08;

public class Cleric {
    String name;
    int hp = 50;
    final int MAXHP = 50;
    int mp = 10;
    final int MAXMP = 10;

    public void selfAid(){
        this.mp -= 5;
        this.hp = this.MAXHP;
    }

    public int pray(int sec){
        int dif = new java.util.Random().nextInt(3);
        int healMp = sec + dif + this.mp;
        int recovery = Math.min(this.MAXMP, healMp);
        this.mp = recovery;
        return recovery;
    }
}
