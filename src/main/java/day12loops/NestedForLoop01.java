package day12loops;

import java.util.Scanner;

public class NestedForLoop01 {
    public static void main(String[] args) {
        //Asagidaki sekli ekrana yazdiran kodu yazinin
//      ****
//      ****
//      ****
        Scanner scan = new Scanner(System.in);
        System.out.println("Satir Sayisini Giriniz");
        int satir =scan.nextInt();

        System.out.println("Sutun Sayisini giriniz");
        int sutun = scan.nextInt();

        System.out.println("Karakter Secin");
        char ch=scan.next().charAt(0);


        for (int i =1; i<=satir; i++){
            for(int k=1;k<sutun;k++){
                System.out.print(ch);
            }
            System.out.println();
        }

        /* Examples2 Asagidaki sekli cizen kodu yaziniz
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
         */

        for (int i=1; i<6;i++){
            for(int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();

        }

//        //Examples 3) Asagidaki sekli cizen kodu yaziniz
//
//        * * * *
//        * * *
//        * *
//        *

        int row=5;

        for (int i=1; i<=row;i++){
            for(int k=row ;k>=i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }






    }
}
