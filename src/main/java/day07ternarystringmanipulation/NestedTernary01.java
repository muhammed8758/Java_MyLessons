package day07ternarystringmanipulation;

import java.util.Scanner;

public class NestedTernary01 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        /*
        Verilen yılın "Leap Year" (Artık Yıl) olup olmadığını kontrol eden kodu yazın
        i) Yıl 100 e bölünürse 400 e de bölünmelidir.==> 1600+
        ii) Yıl 100 e bölünmezse 4 e bölünmelidir. ==> 1996+   2001-
         */
        System.out.println("Bir Yıl Giriniz");
        int year = scan.nextInt();

        String leap = year%100==0 ? (year%400==0 ?  "Leap Year" : "Leap Year Değil"):(year%4==0?"Leap year":"Leap Year değil");
        System.out.println(leap);


        /*
        Examples2) Aşağıdaki kurallara göre password ün geçerli olup olmadığını kontrol ediniz
        i) Sekiz karakterden fazla veya sekiz karakter varsa ilk harfi "i" olmalıdır
        ii)Sekiz karakterden az karakter varsa ilk harfi "K" olmalıdır
         */
        System.out.println("Bir şifre giirniz");
        String pwd= scan.next(); //String pwd= "ijashdsahffhdsf";

        char ilkHarf= pwd.charAt(0);

        String gecerli=pwd.length()<8? (ilkHarf=='K' ?"Geçerli":"Geçersiz") : (ilkHarf=='i'? "geçerli":"geçersiz");






    }
}
