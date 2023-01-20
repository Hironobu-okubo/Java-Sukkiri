package ch08;

public class Main {

    public static void main(String[] args) {
        Cleric cleric = new Cleric();
        cleric.hp -=10;
        cleric.selfAid();
        System.out.println(cleric.mp);
        cleric.pray(5);
        System.out.println(cleric.mp);
    }

}
