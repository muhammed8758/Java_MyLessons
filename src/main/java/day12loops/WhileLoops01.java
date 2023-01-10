package day12loops;

import java.util.Scanner;

public class WhileLoops01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
         Examples1 3 den 10 a kadar tam sayilari ayni satira yazdiran kodu yazar misniz

         */

        //1.yol

        for (int i = 3; i < 11; i++) {
            System.out.print(" " + i);
        }
        //2.yol
        int i = 3;
        while (i < 11) {
            System.out.print(i);
            i++;
        }

        //Examples2 17 den 4 e kadar tum cift sayilari ekrana yazdiran kodu yazdiriniz

        int a = 17;
        while (a > 3) {
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
            a--;
        }
        //Example 3) 12 den 67 e kadar sayilarin toplamini veren kodu yaziniz

        int sum=0;
        int m=5;
        while(m<60){
            sum=sum+m;
            m++;
        }
        System.out.println("sum = " + sum);

        // Example 4) size  verlen bir tam sayinin rakamlari toplami kodu yazdirin   ***** onemli

        int t=385;
        int sonuc=0;
        Math.abs(t);
        while(t>0){

            sonuc=sonuc+t%10;
            t/=10;
        }
        System.out.println(sonuc);


       // Examles5) Kullanicidan aldiginiz bir sayinin carpim taplosunu ekrana yazdiriniz
        System.out.println("sayi Giriniz");
         int s= scan.nextInt();
        int n=1;
        s=Math.abs(s);
        while(n<11){


            System.out.println(s+"*"+n+"="+s*n);
            n++;
        }

    }
}
