package day03Typecastingwrapperscanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        //kullanıcıdan bir dikdörtgenin en ve boyunu alıp alan cevresini hesaplayan kodu yapınız

        Scanner input = new Scanner(System.in);
        System.out.println("Dikdörtgenin Enini Giriniz");
        int en= input.nextInt();
        System.out.println("Dikdörtgenin Uzun Kenarını Giriniz");
        int boy=input.nextInt();
        System.out.println("Alan="+en*boy + "Çevre" + (en+boy)*2);
        System.out.println("Çevre"+en+boy*2);
    }
}
