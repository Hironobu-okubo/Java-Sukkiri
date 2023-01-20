package ch15;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main10 {

    public static void main(String[] args) {
        Instant i1 = Instant.now();
        System.out.println(i1);

        //Instantとlong値との相互変換
        Instant i2 = Instant.ofEpochMilli(1600705425827L);
        long l = i2.toEpochMilli();
        System.out.println(i2);
        System.out.println(l);

        // ZonedDateTimeの生成
        ZonedDateTime z1 = ZonedDateTime.now();
        System.out.println(z1);
        ZonedDateTime z2 = ZonedDateTime.of(2020, 1,2,3,4,5,6,ZoneId.of("Asia/Tokyo"));

        // InstantとZonedDateTimeの相互変換
        Instant i3 = z2.toInstant();
        ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

        System.out.println(z2);
        System.out.println(z3);
        if(z2.isEqual(z3)) System.out.println("これらは同じ瞬間を指す");

    }

}
