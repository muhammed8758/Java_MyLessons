package day04ifstatement;

public class IfStatement01 {

    public static void main(String[] args) {

        //if statement belli kodları belli şartlara bağlı olarak çalıştırmaya yarar
        //Example1) Sayi pozitif ise ekrana potitif yazdır
        //&& and işlemi boolean lar ile kullanılır
        // true && true doğru
        // true && false yanlış

        int s=12;

        if(s>0){
            System.out.println("Pozitif");

            //Exaple2 Verilen karakter büyük harf ise ekrana büyük harf yazdırın

            char ch='A';

            if(ch>='A'&& ch<='Z'){
                System.out.println(ch);



            }
        }

        //Example 3) Verilen bir sayi uc basamklıise ekrana uc basmaklı yazdır

        // Tek karşılaştırmalı kod yazılırsa daha hızlı çalışır JAVA

        int x=123;
        x=Math.abs(x);//absolut value mutlak değer demektir. negatif  ayrımını ortadan kaldırır.


        if(x>99 && x<1000 ){        //x>=100 && x<=999 veya x>99 && x<100

            System.out.println("Üç Basamaklı");

        }

        //Example 4) Verilen bir sayi cift sayi ise ekrana cift sayi yazdiriniz

        int y=88;
        Math.abs(y); //yazmasak da olur

        if(y%2==0){     // Bölmede Kalanı bulmak mod yani % macilis işareti kullanılır
                        // == işareti eşittir anlamındadır. Tek = ise atama operatörüdür. MAtematikdeki eşittir anlamına gelmez

            System.out.println("Çift Sayi");

        }

        //Example5) Verilen bir sayı 300 den küçük veya 1200 den büyük ise ekrana "HArika Sayi YAzdırın"

        int r=250;
        if(r<300 || r>1200){        // Veya nın öncesi ve sonrasına sadece boolean kullanılır
                               // Note: Veya işleminde herşeyin false olması gerekir
                                // Veya işleminde sadece bir tane true sonucu true yapar

            System.out.println("Harika Sayi");

        }

    }
}
