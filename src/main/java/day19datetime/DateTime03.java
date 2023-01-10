package day19datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateTime03 {
    public static void main(String[] args) {
        //Examples1) Japonya ile Almanya arasindaki zaman farkini saat olarak hesaplayiniz
        LocalDateTime currentDateTimeJapan=LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime currentDateTimeGermany=LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        Long fark= ChronoUnit.HOURS.between(currentDateTimeGermany, currentDateTimeJapan);
        System.out.println(fark);

        //Examples2) sabit bir tarih olusturunuz

        LocalDate myDate=LocalDate.of(1987, Month.MAY,04);
        System.out.println("myDate = " + myDate);

        /*
        1)Java da sabit datalari (mesala gun, ay isimler, eyalet isimleri gibi ) depolamak ve gerektiginde kullanmak icin depolar olustururuz
        Bu depolara "Enum" denir.
         */

        //Example 3: USA icin "Woow!", UK icin "Big", "CANADA" icin "Cold", "TURKEY" icin "Vatan", "GERMANY" icin "Araba", "RWANDA" icin "Cay"

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Bir Ulke Ismi gir");
        Countries country= Countries.valueOf(scan.next());

     //   Countries country=Countries.CANADA;

        switch (country){
            case USA:
                System.out.println("Woow");
                break;
            case UK:
                System.out.println("Big");
                break;
            case CANADA:
                System.out.println("Cold");
                break;
            case TURKEY:
                System.out.println("Vatan");
                break;
            case GERMANY:
                System.out.println("Araba");
                break;
            case RWANDA:
                System.out.println("Big");
                break;
            default:
                System.out.println("Hata");
                break;
        }







    }
}
