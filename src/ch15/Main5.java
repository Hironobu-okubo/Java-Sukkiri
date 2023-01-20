package ch15;

public class Main5 {

    public static void main(String[] args) {
        String s = "Java";
//        if(s.matches("Java")) System.out.println("true");
//        if(s.matches("J.va")) System.out.println("true");
//        if(s.matches("Ja*va")) System.out.println("true");
//        if(s.matches("J.*a")) System.out.println("true");
//        if(s.matches("Ja.*")) System.out.println("true");
//        if(s.matches(".*va")) System.out.println("true");
        if(s.matches("[a-z].*")) System.out.println("true");
        if("Hello".matches("Hel{2}o")) System.out.println("true");
    }

}
