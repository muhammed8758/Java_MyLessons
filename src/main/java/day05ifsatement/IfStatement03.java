package day05ifsatement;

import java.util.Scanner;

public class IfStatement03 {
    /*
    İki Tane Stringin biribirine eşit olup olmadığını anlamak için "==" değil "equals()"kullanın
    İki Tane Stringin birbirine eşit olup olmadığını kontrol etmek için iki tane method kullanılabilir
        i)equlas() Büyük harf küçük harfi önemser
        ii)equalsignorcase() Büyük harf küçük harfi önemsemez
     */

    public static void main(String[] args) {
        // Example01) Kullanıcıdan gün isimlerini alınız ogun haftasou mu hafta içimi lduğunu kullanıcıya söyleyiniz
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Gün İsmi Giriniz");

        String gun = input.next();
        //1.Yol

//        if (gun.equalsIgnoreCase("Pazar")) {
//            System.out.println("Hatfa Sonu");
//        } else if (gun.equalsIgnoreCase("Pazartesi")) {
//            System.out.println("Harftaiçi");
//        } else if (gun.equalsIgnoreCase("Salı")) {
//            System.out.println("Harftaiçi");
//        } else if (gun.equalsIgnoreCase("Çarşamba")) {
//            System.out.println("Harftaiçi");
//        } else if (gun.equalsIgnoreCase("Perşembe")) {
//            System.out.println("Harftaiçi");
//        } else if (gun.equalsIgnoreCase("Cuma")) {
//            System.out.println("Harftaiçi");
//        } else if (gun.equalsIgnoreCase("Cumartesi")) {
//            System.out.println("Harfta Sonu");
//        } else {
//            System.out.println("Geçerli bir gün ismi giriniz");
//        }

        //2.Yol
//        if (gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi")) {
//            System.out.println("Hafta Sonu");
//        }
//        if (gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi")) {
//            System.out.println("Hafta sonu...");
//        } else if (gun.equalsIgnoreCase("Pazartesi") ||
//                gun.equalsIgnoreCase("Sali") ||
//                gun.equalsIgnoreCase("Carsamba") ||
//                gun.equalsIgnoreCase("Persembe") ||
//                gun.equalsIgnoreCase("Cuma")) {
//            System.out.println("Hafta ici...");
//        } else {
//            System.out.println("Gecerli bir gun ismi giriniz...");
//        }

        //3.Yol
        boolean haftaSonu = gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi");

        boolean haftaIci  = gun.equalsIgnoreCase("Pazartesi") ||
                gun.equalsIgnoreCase("Sali") ||
                gun.equalsIgnoreCase("Çarşamba") ||
                gun.equalsIgnoreCase("Perşembe") ||
                gun.equalsIgnoreCase("Cuma");

        if (haftaSonu) {
            System.out.println("Hafta sonu...");
        } else if (haftaIci) {
            System.out.println("Hafta ici...");
        } else {
            System.out.println("Gecerli bir gun ismi giriniz...");
        }

    }
}
