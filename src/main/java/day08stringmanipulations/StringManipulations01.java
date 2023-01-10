package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {
        //Kullanıcıdan aldığınız ismin ilk ve son harfini ekrana yazırınız
        //Ramazan Rn
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen isminiz giriniz");
        String isim = input.next();
        //1.yol
        char ilkHarf = isim.charAt(0);
        char sonHarf = isim.charAt(isim.length() - 1);//yazdığınız kod sadece bazı durumlar için çalışırsa "Hard Coding" denir
        System.out.println(" " + ilkHarf + sonHarf);//Yazdığınız kod herdurum için çalışırsa "Dynamic Coding" denir

        //2.yol
        String ilk = isim.substring(0, 1);
        String son = isim.substring(isim.length() - 1);
        System.out.println(ilk + son);//substring de çift tırnak kullanılmıyor

        /*
        Examples2) Aşağıda verilen String deki tüm hayvan isimlerini ekrana yazdırınız
        "Ben kedi eşim tavuk oğlum inek sever"
         */

        String str="Ben kedi, eşim tavuk, oğlum sever inek";

        //substring() iki kullanımı vardır.
        //1) substring(baslangıc indexi, bitiş indexi) Stringin ortasından bir parça almaya yarar
        //2) substring(başlangıç indexi) Stringin verilen indexden sonuna kadar almaya yarar

        String kedi=str.substring(4,8);
        String tavuk=str.substring(15,20);
        String inek=str.substring(34);
        System.out.println(kedi+tavuk+inek);

        //Examples3) ilk isim ve soy ismi içeren isimlerden ilk ve soyisimlerin baş harflerini ekrana yazdırın

        System.out.println("Lütfen isim ve soyisminizi giriniz");

        String tamIsim=input.nextLine();
        String a= tamIsim.substring(0,1);
        String b=tamIsim.split(" ")[1].substring(0,1);//split methodu
        System.out.println(a+b);





    }
}
