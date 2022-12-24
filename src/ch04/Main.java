package ch04;

public class Main {
    public static void main(String[] args) {
        int[] seq = new int[10];

        for(int i = 0; i < seq.length; i++){
            seq[i] = new java.util.Random().nextInt(4);
        }
        char[] base = {'A', 'G', 'C', 'T'};
        for(int i = 0; i < seq.length; i++){
            System.out.println(base[seq[i]]);
        }

        for(int i : seq){
            System.out.println(i);
        }
    }

}
