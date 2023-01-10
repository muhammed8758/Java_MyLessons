package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //binarySearch() methodu kullanilarak bir elemanin Array de olup olmadigini anlariz
        //binarySearch() methodu kullanmadan once Arrays.sort kullanmaliyiz
        //binarySearch() methodu aradiginiz eleman Arrays da varsa o elemanin indexini return eden
        //binarySearch() methodu aradiginiz elemanin Arrays da yoksa ne yapar?
        //binarySearch() methodu nda "-a" negatif goruse yoktur anlaminda. a nin anlami olsaydi hangi sirada olacagini gosteriri
        //binarySearch() methodu tekrarlayan elemanlar icin kullanilmaz


        int arr[]={12,31,43,14};
        int sayi=43;
        Arrays.sort(arr);//{12,14,31,43}

        int indx1=Arrays.binarySearch(arr,sayi);

        System.out.println(indx1);

        int sayi2=58;
        int sonuc=Arrays.binarySearch(arr,sayi2);
        System.out.println("sonuc = " + sonuc);










    }

}
