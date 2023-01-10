package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Ex1) Size verilen pozitif ve negatif sayilar iceren bir int Array deki en buyuk negatif ve en kucuk pozitif elemani bulunuz

        int arr[]={-12,18,-5,23,-2,0};
        Arrays.sort(arr);
        int maxNegative=arr[0];// 0 . index onun icin 0  ilk eleman
        int minPozitive=arr[arr.length-1];// en son elemani pozitive sectim

        for(int w :arr){
            if(w<0){
                maxNegative=Math.max(maxNegative,w);

            }
            if(w>0){
                minPozitive=Math.min(minPozitive,w);

            }


        }
        System.out.println(maxNegative +" & " +  minPozitive);



    }
}
