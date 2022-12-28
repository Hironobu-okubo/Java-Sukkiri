package ch15;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
//        String s1 = "sukkirijava";
//        String s2 = "Java";
//        String s3 = "java";
//
//        if(s3.equals(s2)) System.out.println("s2 = s3");
//        if(s2.equalsIgnoreCase(s3)) System.out.println("s2 = s3");
//        System.out.println(s2.length());
//        if(s2.isEmpty()) System.out.println("s2は空文字です");
//        else System.out.println("s2は空文字ではありません");
//        // 形式１：long型の数値
//        long start = System.currentTimeMillis();
//        String s = "a";
//        s += "b";
//        s += "c";
//        long end = System.currentTimeMillis();
//        System.out.println(end);
//        System.out.println("");
//
//        // 形式２：Date型のインスタンス
//        Date now = new Date();
//        System.out.println(now);
//        System.out.println(now.getTime());
//        Date past = new Date(1600705425827L);
//        System.out.println(past);
//        System.out.println("");

//        // 形式３：人間が指定しやすい６つにint形式
//        Calendar c = Calendar.getInstance();
//        c.set(2019,8,22,1,23,45);
//        System.out.println(c.getTime());
//        c.set(Calendar.MONTH, 9);
//        Date d = c.getTime();
//        System.out.println(d);
//
//        Date now = new Date();
//        c.setTime(now);
//        int y = c.get(Calendar.YEAR);
//        System.out.println(y);

        // 形式４：人間が読みやすいString型のインスタンス


        // Time API
        Instant i1 = Instant.now();
        System.out.println(i1);

        Instant i2 = Instant.ofEpochMilli(1600705425827L);
        System.out.println(i2);

        ZonedDateTime z1 = ZonedDateTime.now();
        System.out.println(z1);
        ZonedDateTime z2 = ZonedDateTime.of(2022,12,28,12,45,50,6000000,ZoneId.of("Asia/Tokyo"));
        System.out.println(z2);

        Instant i3 = z2.toInstant();
        ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

        System.out.println(i3);
        System.out.println(z3);
    }

}
