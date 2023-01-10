package day07ternarystringmanipulation;

public class StringManipulation01 {
    public static void main(String[] args) {

        /*          String Class Methodları

        1) equals()           :i)iki tane String in aynı olup olmadığını anlamamıza yarar.
                              ii) equals() methodu "boolean" return eder.
        2) equalsIgnoreCase(): i) İki tane Stringin aynı olup olmadığını büyük küçük harf ayrımı yapmadan bakar
                              ii) equalsIgnoreCase() "boolean" return eder
        3) toLoverCase()      :i) Bir String deki tüm harfleri küçük harfe çevirmek için kullanılır
                              ii) toLoverCase() methodu "String" return eder.
        4) toUpperCase()      :i) Bir String deki tüm harfleri büyük harfe çevirmek için kullanılır
                              ii) toUpperCase() methodu "String" return eder.
        5) charAt()           :i) Bir String den belli bir indexdeki karakteri almak için kullanılır
                              ii) caharAt() methodu "char" return eder
        6) length()           :i) Bir Strinde kaç tane karakter kullanıldığını öğrenmek için kullanılır
                              ii) length() methodu "int" return eder
        7) contains()         :i) Bir Strinde belli bir karakterin veya karakterlerin olup olmadığını anlamak için kullanılır
                              ii) contains() methodu"boolean"return eder
        8) split()            :i) Bir Stringi istediğimiz karakterden parçalamaya yarar
                              ii) split() methodu "array" return eder.


         */

        /*

        Bir password ün geçerli olup olmadığını aşağıdaki kurallara göre kontrol eden kodu yazınız

        1. En az 8 karakter
        2. Space karakteri içermemeli
        3. İlk Harfi "M" veya"m" harf olmali
        4. Son Karakteri "?" olmalı


         */

        String pwd ="Manisa12?";

        //1. En az 8 karakter
       boolean first= pwd.length()>7;

       //2. Space karakteri içermemeli

        boolean second= !pwd.contains(" ");//! not anlamına gelir

       // 3. İlk Harfi "M" veya"m" harf olmali

        boolean third= pwd.charAt(0)=='M'  || pwd.charAt(0)=='m';

       //4. Son Karakteri "?" olmalı

        boolean fourth = pwd.charAt(pwd.length()-1)=='?'; // son index demektir. Önemli

        System.out.println(first && second && third && fourth);
    }
}
