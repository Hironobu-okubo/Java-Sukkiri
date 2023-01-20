package ch15;

public class Main3 {

    public static void main(String[] args) {
        String s1  = "Java programming";
        System.out.println("文字列s1の4文字目以降は" + s1.substring(3));
        System.out.println(s1.substring(2,7));

        String s2 = " Java and JavaScript  ";
        System.out.println(s2);
        System.out.println(s2.trim());
        System.out.println(s2.toLowerCase());
        System.out.println(s2.toUpperCase());
    }

}
