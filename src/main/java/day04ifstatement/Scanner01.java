package day04ifstatement;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        /*Kullanıcıdan İlk Orta ve soyismini alınız ve aşağıdaki formatta yazdırınız
        Muhammed Doğan
        1234568945
         */
        Scanner input= new Scanner(System.in);
        //1.yol

        System.out.println("İsminini Giriniz =");
        String ilkisim= input.next();//next methodu kullanıcıdan String datası almak için kullanılır
        System.out.println("Orta İsminizi Giriniz=");
        String ortaisim=input.next();
        System.out.println("Soyisminiz Girin=");
        String soyisim=input.next();
        System.out.println("Kimlik Numaranızı Giriniz=");
        String kimlikNo=input.next();

        System.out.println(ilkisim+ " " +ortaisim+" " +soyisim);
        System.out.println(kimlikNo);

        //2. Yol
        System.out.println("İlk, Orta Ve Soyisimizi ve Kimlik No Giriniz");
        String ilk= input.next();
        String orta= input.next();
        String soy= input.next();
        String kimlik= input.next();
        System.out.println(ilk+" "+orta+" "+soy);
        System.out.println(kimlik);

        /*Next ile nextline ın farkı nedir
        next methodu kullanıcıdan gelen String in sadece ilk kelimesini alır
        nextline methodu kullanıcıdan gelen String in tamamını alır.
         */

        //3.Yol
        System.out.println("İlk Orta ve Soyisminiz Giriniz");
        String tamIsim=input.nextLine();
        System.out.println("Kimlik Numaranızı Giriniz");
        String kimlikNumber=input.next();
        System.out.println(kimlikNumber);










    }





}
