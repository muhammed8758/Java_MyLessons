package day06nestedifswitch;

import java.util.Scanner;

        //switch de sadece int, byte, short, char,String data type leri kullanılır

    // switch de double long float boolean kullanılmaz bu durumda if kullanılır

public class Switch03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //Kullanıcıdan işlem ve 2 tane sayı alarak işlemin sonucunu ekrana yazdıran basit bir hesap makinası yapınız

        System.out.println("İşlemi Giriniz+,-,/,*%");
        char islem = input.next().charAt(0);

        System.out.println("İlk Sayıyı Giriniz");
        double ilk=input.nextDouble();

        System.out.println("İkinci Sayıyı Giriniz");
        double ikinci=input.nextDouble();

        switch (islem){

            case'+':
                System.out.println(ilk+ikinci);
                break;
            case'-':
                System.out.println(ilk-ikinci);
                break;
            case'*':
                System.out.println(ilk*ikinci);
                break;
            case'/':
                System.out.println(ilk/ikinci);
                break;
            case'%':
                System.out.println((ilk*ikinci)/100);
                break;
            default:
                System.out.println("hata");

            }


        }


    }

