package zissennch01;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        //        Hero h = new Hero("Hero",100,10);
        //        String s = h.toString();
        //        System.out.println(s);

        //        List<Hero1> list = new ArrayList<>();
        //        Hero1 h1 = new Hero1();
        //        h1.name = "Minato";
        //        list.add(h1);
        //        System.out.println("要素数=" + list.size());
        //        h1 = new Hero1();
        //        h1.name = "Minato";
        //        list.remove(h1);
        //        System.out.println("要素数=" + list.size());

        //        int[] a = {1,2,3,4,5};
        //        int[] b = {1,2,3,4,5};
        //        System.out.println("謝った判定：" + a.equals(b));
        //        System.out.println("正しい判定：" +  Arrays.equals(a, b));
        Set<Hero2> list = new HashSet<>();
        Hero2 h2 = new Hero2();
        list.add(h2);
        System.out.println("要素数=" + list.size());
        h2 = new Hero2();
        h2.name = "Minato";
        list.remove(h2);
        System.out.println("要素数=" + list.size());
    }

}
