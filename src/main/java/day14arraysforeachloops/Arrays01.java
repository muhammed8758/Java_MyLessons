package day14arraysforeachloops;


import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {
        /*
        Arrays lerin icersisine sadece primitive data tipleri  ve referaslar yerlestirilebilir.
         */
        String str[] = new String[3];
        str[0] = "Java";
        str[1] = "did";
        str[2] = "suprise you";

      //  System.out.println(Arrays.toString(str));

        //Example1) String bir Array olusturunuz ve "Tom" ve "tom" dan onceki tum elemanlari ekrana yazdiriniz

        String arr[] = {"jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};
        for (String w : arr) {
         //   System.out.print(w + " ");
            if (w.equals("Tom")) {
                break;
            }
         //  System.out.println( );

        }
        //Example2) String bir Array olusturunuz  "Tom" ve "Jane" haric tum elemanlari ekrana yazdiriniz
        String brr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};
        for (String w : brr) {
            if (w.equals("Jane") || w.equals("Tom")) {
                continue;
            }
           // System.out.print( w + " ");


        }

        //Example3) Kullanici ile beraber bir Array olusturunuz
        //bir ogretmenin sinifindaki ogrencilerin isimlerini aplications a yuklemesini saglayan kodu yaziniz

         Scanner scan = new Scanner(System.in);
        System.out.println("Kac Ogrenci Ismi Gireceksiniz");

        int numOfStd=scan.nextInt();
        String names[]=new String[numOfStd];

        System.out.println("Girisi Sonlandirmak icin Q harfine basiniz");

        for(int i=1;i<=numOfStd;i++){
            System.out.println("Lutfen "+ i+". ogrencinin ismini giriniz");

            String stdName=scan.next();


            if(stdName.equalsIgnoreCase("Q")){
                break;
            }
            names[i-1]=stdName;// ilk index e koymak iicin sifira a ulasmak icin -1 koyduk

        }
    System.out.println(Arrays.toString(names));



    }
}