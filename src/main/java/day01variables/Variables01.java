package day01variables;

import java.net.SocketOption;
import java.util.Scanner;

public class Variables01 {
    // Variables nasıl oluşturulur?
    //Java da "; " İngilizcedeki "." gibidir.
    // İngilizcede Cümle deriz JAva da Statement deriz
    // "=" "Assignment Operatör olarak adlandırılır.



    public int age = 13;
    public int height = 183;

            //Java da Data Type'ları

    /*
                            Primitive Data Type
        1) İnt: Integer'in kısaltılmasıdır. İnteger Tam sayı demektir.  32 bit kullanır
            Matematik de tam sayıların başı ve sonu yoktur.
            Fakat Java da Tam sayıların başı ve sonu vardır.
                En Küçük int=-2 147 483 648
                En Büyük int= 2 147 483 647


        2) byte Tamsayılar için kullanılır,                              8 bit kullanır
                En Küçük byte = -128
                En Büyük byte = 127

         3) short Tamsayılar için                                        16 bit kullanır
                En Küçük short = -32768
                En Büyük short =  37767

         4) long Tamsayılar için                                         64 bit kullanır
                En Küçük long = -9,223,372,36,854,755,808
                En Büyük long =  9,223,372,36,854,755,807

         5) float: Ondalıklı sayılar için                               32 bit kullanılır
                   "float" virgülden sonra 7 basamak içerir.
                   fiyatlar için
                   "float"değerinden sonra "f" "F" konulur
                   bu yüzdden pek kullanılmaz

         6 double Ondalıklı sayılar için                                64 bit kullanılır
                    "virgülden sonra 16 basamak içerir
                    hassas ölçümler için
                    genelde bu kullanılır

          7 boolean true veya false değerleri için kulanılır             1 bit kullanılır

          8 char : Tek Karekter için kullanılır                            16 bit kullanılır
          A, c, ?, =
          Not: char lara değer verirken değeri ' ' arasına koyun yoksa hata verir

          Note: Java büyük ve küçük harflere duyarlıdır
                True ile true farklıdır.

          Note: Numeric Data Type = byte< short < int < long < float < double
                Numeric Olmayan Data Type = bloolean - char

                Non-Primitive Data Type

        String = İsim, adres, kimlik numarası gibi bir veya birden fazla karakter içeren değerlerde kullanılır
                Sring değerleri "  " tırnak arasında kullanılır
                 Bir String oluşturduğunuzda Java size bir sürü method verir

                 psvm kısa yol

        Primitive ile Non-Primitive arasındaki fark nedir.  ONEMLİ BİLİNMESİ GEREKİR

      1) Non-Primitive data type lerinin yanında method vardır.
        Primitive data type lerinde sadece değer vardır. method yoktur.

      2)Primitive data type leri Java tarafından oluşturulmuştur. Toplam 8 tanedir. Biz Primitive data oluşturamayız
      Non- primitive data type leri Java tarafından oluşturulmuştur. Biz de oluştururuz.
      Non primitive ler sayılamayacak kadar çoktur. Çünkü her developer Non primitive data oluşturabilir.

      3) Primitive data type leri isimlendirilirken küçük harflerle başlarlar.
       Non primitive data type isimleri büyük harfle başlar.

      4) Primitive data type lar memoryde farklı büyüklüklerde yerle kaplar
        Non Primitive data type lar memory de aynı büyüklükte yer kaplar



     */
    public byte price = 12;
    public short populationOfVillage = 23000;
    public float priceOfShirt = 13.99f;
    public double weightOfCell = 0.0000000012045;

    // Siz "long" demenize rağmen verilen sayıyı "int" kabul eder
     // Bu Yüzden "long" bir variable "in" aralığı dışında bir say verirseniz "L" veya "l"
    public long populationOfWorld = 7000000000L;

    // Burada "L" koymadığımız halde problem yok cunku "1234" int aralığına girer
    public long x = 1234L;

    public boolean isOld = true;
    public boolean isRich = false;
    public char initial = 'S';

    public String name ="Tom Hangs";

    // main method arabanın motoru gibidir. psvm
    // main method çalışmadan hiçbişey çalışmaz

    public static void main(String[] args) {


      /*  Scanner scan = new Scanner(System.in);
        System.out.println("İki Sayı Giriniz");
        int n1= scan.nextInt();
        int n2= scan.nextInt();
        System.out.println("Değiştirmeden Önce :"+n1+"-"+n2);
        int temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("Değiştikten Sonra="+n1+"-"+n2);

       */









    }
}