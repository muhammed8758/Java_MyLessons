package day15arraysmultidimensionalarrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensionalArrays01 {
    //Bir Array in elemanlari Array ise bu Array ler Multi Dimensional Array dir

    public static void main(String[] args) {
        //Multi Dimensional Arrays nasil olusturulur
        int arr[][]=new int[3][2];
        System.out.println(Arrays.deepToString(arr));
        //Multi Dimensional Arrays lare eleman ekleme nasil yapilir

        arr[0][0]=3;
        arr[0][1]=-4;
        arr[1][0]=6;
        arr[1][1]=18;
        arr[2][0]=-7;
        arr[2][1]=-0;

        //Multi Dimensional Arrays console yazdir

        System.out.println(Arrays.deepToString(arr));

        // Multi Dimensional Arrays lerde Array elemanlarindan biri nasil yazdirilir

        System.out.println(Arrays.toString(arr[1]));

        //Multi Dimensional Arrays ic ArraysLerdeki elemanlar nasil yazdirilir

        System.out.println(arr[1][0]);// int yazdirdigimiz icin Arrays yazmadik

        //examples1 String bir Multi Dimensional Arrays olusturunuz
        //          Eleman ekleyiniz
        //          Toplam eleman sayisini ekrana yazdiran kodu yaziniz

        // String bir Multi Dimensional Arrays olusturunuz

        String brr[][]=new String[4][3];

        brr[0][0]="A";
        brr[0][1]="B";
        brr[0][2]="C";

        brr[1][0]="D";
        brr[1][1]="E";
        brr[1][2]="F";

        brr[2][0]="G";
        brr[2][1]="H";
        brr[2][2]="K";

        brr[3][0]="L";
        brr[3][1]="M";
        brr[3][2]="N";

        System.out.println(Arrays.deepToString(brr));//[[A, B, C], [D, E, F], [G, H, K], [L, M, N]]

        int sum=0;

        for(String[] w:brr){
           sum= w.length+sum;

        }
        System.out.println(sum);




    }
}
