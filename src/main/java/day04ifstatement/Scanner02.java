package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {

    /*
    Note: char variableleri matematiksel işaretler ile kullanılırsa Java onların  ASCII(A=65 gibi)değerlerini kullanır

     */
    public static void main(String[] args) {
        //Example01 Kullanıcıdan İlk ve Soy İsmini Alınız. İlk ve Soy İsminin ilk harflerini yazdırınız

        //1.Yol
          Scanner input=new Scanner(System.in);
        System.out.println("İlk İsminiz Giriniz");
        char ilk = input.next().charAt(0);//İndex 0123... den başlar hangi harfi istiyorsan onu kullanacan parantez içine

        System.out.println("Soyismini Giriniz");
        char son=input.next().charAt(0);

        System.out.println(""+ilk+son);// + işaretinin Javada iki anlamı var 1.toplama 2. birleştirme yapar

        //2.Yol
        System.out.println("Tam İsminizi Giriniz");// Ali Can
        String tamIsim=input.nextLine();

        char ilkHarf=tamIsim.charAt(0);
        System.out.print(ilkHarf);

        char soyIsminIlkHarfi = tamIsim.split(" ")[1].charAt(0);
        System.out.println(soyIsminIlkHarfi);

        System.out.println("Araba Markasını Giriniz");
        String arabaMarkasi=input.nextLine();
        char BasHarfler=arabaMarkasi.split(" ")[1].charAt(0);
        System.out.println("BasHarfler = " + BasHarfler);




    }
}
