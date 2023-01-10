package day06nestedifswitch;

import java.util.Scanner;

public class ifStatement01 {
    public static void main(String[] args) {
        //Type a code, get age from user and decide which stage on it
        //Kullanıcıdan yaş değerini alan ve yasın hangi evrede olduğunu asagıdaki tbloya yazdırınız
        //0 - 4 => baby
        //5 - 12 => child
        //13 - 20 => teenager
        //21 - 30 => adult
        //else (not expected age)
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen Yaşınızı giriniz");
        int yas= input.nextInt();
        if(yas<0){
            System.out.println("Geçerli Yaş Giriniz");
        }else if(yas<5)
        {
            System.out.println("Bebek");
        }else if(yas<13)
        {
            System.out.println("Çocuk");
        }else if(yas<21)
        {
            System.out.println("Genç");
        }else if(yas<31)
        {
            System.out.println("Yetişkin");
        }else{
            System.out.println("Tanımlanmamış Evre");
        }
    }
}
