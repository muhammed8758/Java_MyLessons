package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {
        String str="Java is Easy";

        //indexOf() methodu verielen charakter veya charekterlerin ilk görünümünün indexini verir.

        int idxA=str.indexOf("a");
        System.out.println("idxA = " + idxA);

        //lastIndexOf() methodu verilen  character veya charakterlerin son görünümünün indexini verir.

        int lst=str.lastIndexOf("a");
        System.out.println("lst = " + lst);

        String rt="Kara kara düşünme Ankara";
        int rt1=rt.indexOf("kara");
        System.out.println("rt1 = " + rt1);

        String s="Mississippi";
        int s1=s.indexOf("i");//indexOf() hem string hem de char la kullanılabilir.
        System.out.println("s = " + s1);//

        int x=s.lastIndexOf("iss");
        System.out.println("x = " + x);//son görünümün ilk karakterinin indexini verir.

        /*
        Examples01) Bir stringdeki tekrarsız bir stringde verilen bir karakterin
        tekrarsız veya tekrarlı olup olmadığını gösteren kodu yazınız
        "Helloooooo"==>H=Tekrarsız, e=Tekrarsız, l=Tekrarlı, o= Tekrarlı

        indexOf () ile lastIndexOf() aynı ise tekrarsız farklı ise tekrarlı
         */

        String t= "Helloooo";
        char c='H';
        if(t.indexOf(c)==t.lastIndexOf(c)){
            System.out.println("Tekrarsız");

        }else{
            System.out.println("Tekrarlı");

        }

        String u="Learn Java earn money";
        int snc=u.indexOf("e" ,4);//indexOf() iki parametre ile kullanılırsa ikinci parametrede verilen sayı karakterinden başlar
        System.out.println("snc = " + snc);//11

        int snc2=u.lastIndexOf("a",7);
        System.out.println("snc2 = " + snc2);//2

        String v="Java is Java";
        //isEmpty() methodu bir Stringin boş olup olmadığını kontrol eder
        //Eğer strinde herhangi bir karakter varsa True return eder yoksa false return eder
        //length()==0 demek isEmpty() true olduğu anlamına gelir


        //lastIndexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayiyi index olarak kabul edip
        //en bastan bu indexe kadar olan karakterleri bir kutu icerisine aliniz ve lastIndexOf() methodunu sadece bu kutu icindeki String icin kullaninin
        String m ="Hello everyone";
        int e = m.lastIndexOf("e",10);
        System.out.println(e);

        boolean bosMu=v.isEmpty();
        System.out.println("bosMu = " + bosMu);//false ,, neden çünkü string dolu

        String y=" ";
        boolean blank=y.isBlank();//
        System.out.println("blank = " + blank);

        //Examples2) Kullanıcıdan alınan isim mutlaka space den farklı en az 1 character içermelidir

        Scanner input = new Scanner(System.in);
        System.out.println("İlk İsminizi Giriniz");
        String ilk=input.nextLine();
        if(ilk.isBlank()){
            System.out.println("Sana ismini gir dedim");

        }else{

        }



    }

}
