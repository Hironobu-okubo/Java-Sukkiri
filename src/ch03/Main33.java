package ch03;

public class Main33 {

    public static void main(String[] args) {
        int isHungry = new java.util.Random().nextInt(2);
        String food = "たこ焼き";
        System.out.println("こんにちは");
        if(isHungry == 0){
            System.out.println("お腹がいっぱいです");
        }
        else{
            System.out.println("腹ぺこです");
            System.out.println(food + "をいただきます");
        }
        System.out.println("ごちそうさまでした");
    }

}
