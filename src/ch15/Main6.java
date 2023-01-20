package ch15;

public class Main6 {

    public static void main(String[] args) {
        String s = "1";
        long start = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            s += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }

}
