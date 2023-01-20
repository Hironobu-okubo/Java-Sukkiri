package ch15;

public class Main2 {

    public static void main(String[] args) {
        String s1 = "Java and JavaScript";
        if(s1.contains("Java")){
            System.out.println("文字列s1は、Javaを含んでいます");
        }
        if(s1.endsWith("t")){
            System.out.println("s1の末尾の文字はtです");
        }
        System.out.println("文字列s1でJavaが最初に登場する位置は" + s1.indexOf("Java"));
        System.out.println("文字列s1でJavaが最後に登場する位置は" + s1.lastIndexOf("Java"));
    }

}
