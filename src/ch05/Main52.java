package ch05;

public class Main52 {

    public static void main(String[] args) {
        email("タイトル", "a@gmail.com", "本文です");
        email("a@gmail.com", "本文です");
    }

    public static void email(String title, String address, String text){
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名：" + title);
        System.out.println("本文：" + text);
    }

    public static void email (String address, String text) {
        System.out.println(address + "に以下のメールを送信しました");
        System.out.println("件名：無題");
        System.out.println("本文：" + text);
    }

}
