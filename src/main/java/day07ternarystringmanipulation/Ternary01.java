package day07ternarystringmanipulation;


import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Example01 Bir sayinin  pozitif olup olmadığını ekrana yazdıran kodu yazınız
        //1.yol if else

        int a = -12;
        if (a > 0) {
            System.out.println("pozitif");
        } else {
            System.out.println("pozitif değil");
        }


        //2.yol
        //               Condition      ?   Condition doğru ise uygulanacak kod  :  Condition yanlış ise uygulanacak kod
        String sonuc = a > 0 ? "pozitif" : "Pozitif değil";
        System.out.println(sonuc);

        //Example2 İki sayıda küçük olanı seçen kodu yazın

        int b = 120;
        int c = 23;

        int min = b < c ? b : c;
        System.out.println(min);

        //Example 3:Verilen bir sayının mutlak değerini hesaplayan kodu yazın

        //          Pozitif sayıların  ve sıfırın mutlak değeri kemdisidir
        //          Negatif sayıların mutlak değeri -1 ile çarpılmış halidir

        int d = -45;

        int abs = d < 0 ? -1 * d : d;
        System.out.println(abs);

        // Examples4: İki tane sayı aynı işaretli ise bu sayıları çarpınız. Farklı işaretli ise işlem yapamam mesajı verin


        int e = 12;
        int f = 10;

        // Ternary farklı data type lerinde sonuc return ederse sonucun data type = "Object" yapınız

        Object islem = (e > 0 && f > 0) || (e < 0 && f < 0) ? e * f : "işlem yapamam";
        System.out.println(islem);

        //Note:java da her classın en az bir tane parent class ı vardır.
        //        Sadece "Object" class ın parent classı yoktur.

    }
}