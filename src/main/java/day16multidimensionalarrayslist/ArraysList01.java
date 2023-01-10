package day16multidimensionalarrayslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysList01 {
    /*
    ArraysListler ayni data tipine sahip birden fazla datayi depolamak icin kullanilir
    Array ile ArraList in farki
    1) Array olusturulurken Arrayin icersinde kac tane eleman konulacagini soylemeliyiz ve soyledigimiz eleman sayisindan fazla eleman koyamayiz
        Arrayler eleman sayisnda "fixed" dirlar
        ArrayListleri olusturulurken eleman sayisi soylemeye gerek yok. Cunku ArrayListler eleman sayisinda Flexible dirlar

    2) Array lerin icine Primitive ve referance ler konulabilir
       ArrayListlerin icine sadece non prpimitive ler konulur. WrapperClass

    3) Arraylar SuperFaster, memory i cok az kullanilir. kesin belli olan uzunluklarda arrayler kullanilir

    Bu kisim interviev de sorulabilir


     */
    public static void main(String[] args) {
        // ArrayList nasil olusturulur

        //1.Yol
        ArrayList<Integer>ages=new ArrayList<Integer>();
        //2.yol
        ArrayList<Integer>heigts=new ArrayList<>();// bu biraz daha ozel tanimlama
        //3.yol
        List<Integer> nums= new ArrayList<>();// bu biraz daha genel bir tanimlama
        
        //ArrayListler nasil yazdirilir
        System.out.println(nums);//[]

        // ArrayList lere nasil eleman eklenir
        // add() methodu boolean return eder
        nums.add(21);

        nums.add(18);
        nums.add(20);
        nums.add(58);
        nums.add(40);



        //add() her zaman eleamni sona eklar buna (insertion order) denir

        nums.add(1,50);// arraya ekler
        System.out.println("nums = " + nums);

        List<Integer>prices=new ArrayList<>();
        prices.add(23);
        prices.add(185);


        nums.addAll(prices);
        System.out.println(nums);
        System.out.println(prices);

        nums.addAll(2,prices);
        System.out.println(nums);

        //ArrayList lerin eleman sayisi nasil bulunur


        int elemanSayisi=nums.size();
        System.out.println(elemanSayisi);

        //ArrayList lerde herhangi bir eleman nasil alinir
        // get methodu istenilen bir index deki elemani verir
        int el1=nums.get(3);
        System.out.println(el1);//185

        //ArrayListlar bos olup olmadigini nasil ogreniriz

        boolean bos1=nums.isEmpty();
        System.out.println("bos1 = " + bos1);

        boolean bos2=ages.isEmpty();
        System.out.println("bos2 = " + bos2);

        //ArrayList lerde herhangi bir eleman nasil degistirilir
        nums.set(3,200);
        System.out.println(nums);

        // Examples1) nums ArrayListindeki tum tek sayilari 11 arttirdikdan sonra ekrana yazdiriniz

        for(int w : nums){
            if(w%2!=0){
                nums.set(nums.indexOf(w),w+11);


            }
        }
        System.out.println(nums);

        // Examples2) ArrayList 200 elemaini siliniz

        // notes: Tum tamsayilar Java icin aksi soylenmedikce primitive dir yani Int dir
        //notes : Primitiveler ArrayList lerin elemani olamazlar Non Primitivler depolar
        // notes: Primitive i Wrapper Clas a cevirirseniz Non Primitive ler olur, Bu sekilde ArrayListe elemani olur
        
        Integer sayi=200;
        nums.remove(sayi);// remove methodunun icersine Java onu index olarak kabul eder
        System.out.println(nums);




    }

}
