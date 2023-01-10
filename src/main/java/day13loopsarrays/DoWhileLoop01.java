package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        // Example1) kullanicidan bir sayi aliniz sayi 100 den kucuk ise ekrana kazandin yazdiriniz aksi halde kaybettin yazdirin
        //Kullanici kazandikca oyun devam etmeli
        Scanner scan = new Scanner(System.in);
        int sayi = 0;// baslangic degeri ne konulursa fark etmez
        do {
            System.out.println("Bir Sayi Giriniz");
            sayi = scan.nextInt();
            if (sayi < 100) {
                System.out.println("Kazandiniz");
            }
        } while (sayi < 100);//sayi yuzden kucuk oldugu surece loop doner
        System.out.println("Kaybettiniz");

        //Examples2) Kullanicidan ismimler aliniz ilk harfinin buyuk harf olup olmadigini kontrol ediniz

        do {
            System.out.println("Isim Giriniz");
            char ilkHarf = scan.next().charAt(0);

            if (ilkHarf >= 'A' && ilkHarf <= 'Z') {
                System.out.println("Ismi Basarili Girdiniz");
            } else {
                System.out.println("Ismi Yanlis Girdiginiz Icin Isleminz Iptal Edilmistir");
                break;      // loop u kirar disari atar
            }

        }while (true);// loop u tekrar ettiriyor false  yazinca bir kere giriliyor


        // Infinite Loop Sonsuz Loop
        /*Artirma Azaltma kisminda hata yapilirsa infinitive loop sorunsali olusur

         */
//        for(int i=1;i<4;){
//            System.out.println("hi");
//
//        }

        int i=12;
        while(i<15){
            System.out.println("Hi");
        }



    }
}

