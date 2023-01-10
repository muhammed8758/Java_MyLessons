package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //Examples01) Bir strindeki space hariç kaç tane karakter kullanıldığını gösteren kodu yazınız
        //              "Ali okula gitti."==>14

        String str="Ali Okula Gitti.";
        int num= str.replace(" ","").length();//replace charakter siler, length sayma işi yapar
        System.out.println(num);

        // replace() methodu bir stringdeki herhangi bir karakter veya karakterleri değiştirmek için kullanılır

        //Examples2) Bir Stringdeki tüm 'a' harflerini 'A' ya çevirin
        String s="Ankaranın taşına gözlerimin yaşına bak";
        String k=s.replace("a","A");
        System.out.println(k);

        //Examples3) Bir String deki "kara" kelimelerinin yerine "*" koyunuz
        String t="Kara kara düşünme Ankara";
        String yeniT=t.replace("kara","*");
        System.out.println(yeniT);//Kara * düşünme An*

        //Examples4) Bir String deki tüm sayıları "*" çeviriniz

        String stdId="AC202117064";
        String yeniStdId=stdId.replaceAll("[0-9]","*");
        System.out.println(yeniStdId);
        /*
        Bir grup datayı ifade eden kodlara "Regex" denir.
        "Regex" Regular Expressions in kısaltılmış hali

        1) Tüm Rakamlar[0-9]
        2) Tüm Küçük Harfler[a-z]
        3) Tüm Büyük Harfler[A,Z]
        4) Tüm Harfler [a-zA-Z]
        5) Sesli HArfler[aeiouAEIOU]
        6) Space[ ] \\s
        7) Tüm Rakamlar ve Tüm Harfler[0-9a-zA_Z]
        8) Tüm Noktalama İşaretleri\\p{Punct}

        1) Rakamlar Hariç Tüm Karakterler [^0-9]
        2) Küçük Harfler Hariç Tüm Karakterler[^a-z]
        3) Büyük HArler Hariç Tüm Karakterler[^A-Z]
        4) Tüm Harfler Hariç Tüm Karakterler[^a-zA-Z]
        5) Space HAriç [^ ]
         */

        //Examples5) Verilen bir Stringde kullanılan noktalama işareti ve rakamlar ve space karakteri hariç
        // tüm karakterlerin sayısını bulan kodu yazınız

        String u= "Ali 13 yaşında, dersem inanma!...";
        int sonuc= u.
                    replaceAll("[0-9]","").
                    replace(" ","").
                    replaceAll("\\p{Punct}","").
                    length();


        System.out.println("sonuc = " + sonuc);

        /*
        //Example 6: Bir password'un gecerli olmadigini asagidaki kurallara gore test eden kodu yaziniz
           i)Space haric en az sekiz karakter olmali
           ii)En az 1 sembol icermeli
           iii)En az 1 rakam icermeli
          iv)En az 1 buyuk harf icermeli
           v)En az 1 kucuk harf icermeli
         */

        String pwd= "B78c? K!m";
        //i)Space haric en az sekiz karakter olmali
        boolean first= pwd.replace(" ","").length()>7;

        //ii)En az 1 sembol icermeli
        boolean second= pwd.replaceAll("[0-9a-zA-Z ]","").length()>0;

        //iii)En az 1 rakam icermeli
        boolean third=pwd.replaceAll("[^0-9]","").length()>0;

        //iv)En az 1 buyuk harf icermeli
        boolean fourth=pwd.replaceAll("[^A-Z]","").length()>0;

        // v)En az 1 kucuk harf icermeli
        boolean five=pwd.replaceAll("[^a-z]","").length()>0;

        boolean pwdGecerli=first && second && third && fourth && five;
        if(pwdGecerli){
            System.out.println("geçerli");
        }else{
            System.out.println("geçersiz");
        }

        //Examples7) Bir Strindeki noktalama işaretlerinin karakter sayısını gösteren kodu yazınız

        String cumle= "Sen yapmazsan, ben ?...";

        int number=cumle.replaceAll("[^\\p{Punct}]","").length();
        System.out.println("number = " + number);

        //Exampes8) Verilen bir String "Al" ile başlıyor ve "x" ile bitiyorsa ekrana"HArika" yazdırın
                    //aksi halde normal yazdırın

        String v= "Alex";
        boolean baslangıc=v.startsWith("Al");//bir string ne ile başladığını kontrol eder

        boolean bitis=v.endsWith("x");//bir string ne ile bittiğini kontrol eder

        String result = baslangıc && bitis?("HArika"):("Normal");
        System.out.println(result);



    }
}
