package day27exceptions;

public class Exceptions01 {
    public static void main(String[] args) {

       double r1= compareNumOfCharacters("Java", "xy");
        System.out.println(r1);//2

        double r2= compareNumOfCharacters(null, "xy");
        System.out.println(r2);

        double r3= compareNumOfCharacters("Java", "");
        System.out.println(r3);



    }
//Verilen 2 stringden birinin Character sayisinin digerinin kac kati oldugunu veren method olusturunuz

    public static double compareNumOfCharacters(String s, String t){
        double result=0;

        try{
            result= s.length()/t.length();
        }catch(NullPointerException e){
            System.out.println("length() methodu null ile kullanilamaz");
        }catch(ArithmeticException e){
            System.out.println("Herhangi bir sayi sifir ile bolunemez");
        }finally {// databese ile baglantiyi kesmek icin her try catch den sonra finally yazmak zorundayiz
            System.out.println("Database ile connection kesildi");
        }

        return result;

    }

    /*
         "final" "finally" "finalize" aciklayiniz   // INTERVIEV SORUSU

         1)"final" bir keyword dur. Variable, Class ve Method lar icin kullanilir. Detayina bak
         2)"finally" bir code block dur
            try-catch veya sadece try ile kullanilir
            "finally" code block icersine yazilan codelar her halukarda calisir
            Mesala database ile connection u kesmek herhalukarda yapilmasi gerek. Bunu "finally" ile yapariz
         3)"finalize" bir method dur. Bu method Java tarafindan datalar imha edilmeden once cagrilir. Bu method datalari
            imha edecek hale getirir ve daha sonra Garbage Collector bu datalari imha eder

            "finalize" methodunu Java Developer lar da cagirabilir. ama java kendi bildigini yapar.




     */

}
