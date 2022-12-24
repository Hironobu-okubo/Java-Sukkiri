package ch02;

public class EscapeSequence {

    public static void main(String[] args) {
//        System.out.println("エスケープシーケンス\"を使用");
//        System.out.println("\'");
//        System.out.println("\\");
//        System.out.println("aiueo\naiueo");
//        String age = "31";
//        int n = Integer.parseInt(age);
//        System.out.println(n);
//        int r = new java.util.Random().nextInt(90);
//        System.out.println(r);
//        System.out.println(r);

        String name = new java.util.Scanner(System.in).nextLine();
        int age = new java.util.Scanner(System.in).nextInt();
        System.out.println("名前は" + name + " 年齢は" + age);
    }

}
