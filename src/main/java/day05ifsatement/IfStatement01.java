package day05ifsatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        //example1) Kullanıcıdan alınan sayının tek mi çift mi
        // olduğunu ekrana yazan kodu yazınız

        Scanner input= new Scanner(System.in);
        System.out.println("Bir Sayı giriniz");
        int s= input.nextInt();

        //1. yol
        if(s%2==0)
        {
            System.out.println("çift Sayı");

        }
        if(s%2!=0)
        {     //!= eşit değil demek
            System.out.println("Tek Sayı");
        }

        //2. yol// tercih edilen yol budur

        if(s%2==0)
        {
            System.out.println("Çift Sayı ");

        }
        else        // birinci şart değilse
        {
            System.out.println("Tek Sayı ");
        }

        //Example2) Bir Sayının negatif pozitif veya nötr
        // olduğunu söyleyen kodu yazınız

        System.out.println("Bir sayı Giriniz");

        double d=input.nextDouble();
        if(d>0)
        {
            System.out.println("Pozitif");
        }
        else if(d==0)
        {
            System.out.println("nötr");
        }
        else
        {
            System.out.println("negatif");
        }

    }
}
