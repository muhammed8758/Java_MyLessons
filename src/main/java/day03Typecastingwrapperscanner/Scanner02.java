package day03Typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {
    //Example Sayıları kullanıcıdan alan ve toplama işlemi yapan kodu yazın

        Scanner input = new Scanner(System.in);
        System.out.println("ilk Sayıyı Giriniz");

        double sayi1= input.nextDouble();

        System.out.println("İkinci Sayıyı Giriniz");

        double sayi2= input.nextDouble();

        System.out.println(sayi1+sayi2);


    }
}
