package day16multidimensionalarrayslist;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

    // Arrays veya Collections varsa " for each loop" kullanmak ilk tercihimiz olmasi lazim
    //Arrays veya Collections var ama "index" kullanmak zorundaysan o zaman "for each loop" calismaz diger loop lari kullanmalisin
    public static void main(String[] args) {
        // Bir Tane Int MultiDimensionalArrays olusturunuz
        // Bu array deki tum sayilarin toplamini veren kodu yaziniz

        int arr[][]={{2,5,1},{32,75},{13,21,43,56}};
        int sum=0;
        for(int[] w : arr){
            System.out.println(Arrays.toString(w));
            for(int k:w){
                sum=sum+k;
            }

        }
        System.out.println("sum = " + sum);

        //Ex2) Bir MultiDimensionalArrays i normal Array e ceviren kodu yaziniz
        //int brr[][]={{2,5,1},{32,75}};
        int brr[][]={{2,5,1},{32,75}};

        int toplam=0;
        for(int[] w : brr){
            toplam=toplam +w.length;// eleman sayisini bulduk
        }
        System.out.println("toplam = " + toplam);

        int idx=0;

        int yeniBrr[]=new int[toplam];

        for(int[] w :brr){
            for(int k:w){
                yeniBrr[idx]=k;
                idx++;

            }

        }
        System.out.println(Arrays.toString(yeniBrr));

    }
}
