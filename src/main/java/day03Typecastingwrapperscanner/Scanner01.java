package day03Typecastingwrapperscanner;


import java.util.Scanner;

public class Scanner01 {
    //Scanner kallanıcıdan data almaya yarar.
    //Scanner bir Java Classıdır. Bu Class ı kullanabilmek için İmport etmek gerekir.
    //Scanner Class ı Java nın util kütüphanesindedir.

    public static void main(String[] args) {

        //Kullanıcıdan data almak için yapılması gerekenler
        //1. adım Scanner Class ından Obj. oluştur.

        Scanner input = new Scanner(System.in);    //Constructer

        //2. adım Kullanıcıya ne yapacağını söylemek gerek
        System.out.println("Hey Kullanıcı Yaşını Gir");

        //3. adım Kullanıcıdan aldın datayı bir variablenin içine koy
        byte age= input.nextByte();

        System.out.println("Hey Kullanıcı="+age);








    }
}
