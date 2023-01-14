package ch03;

public class Main {
    public static void main(String[] args) {
        int fortune = new java.util.Random().nextInt(5) + 1;
        System.out.println(fortune);
        switch(fortune) {
        case 1:
        case 2:
            System.out.println("いいね！");
        case 3:
            System.out.println("普通です！");
        case 4:
        case 5:
            System.out.println("うーん……");
        }
    }
}
