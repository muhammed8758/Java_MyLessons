package day14arraysforeachloops;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {


        // examples1) [0,2,3,0,12,0] sifirlarini sona koyunuz
        //            [2,3,12,0,0,0]

        int original[] = {0, 2, 3, 0, 12, 0};
        int yeni[] = new int[original.length];

        int idx = 0;
        for (int i = 0; i < original.length; i++) {
            if (original[i] != 0) {
                yeni[idx] = original[i];
                idx++;
            }

        }
        System.out.println(Arrays.toString(yeni));

        //Example 2: Bir Array'in icinde herhangi bir elemanin olup olmadigini kontrol eden ve kac kere tekrarlandigini gosteren kodu yaziniz
//           [ 2, 1, 2, -3, 2] ==> Kullanici 2'yi sordu ==> 2 elemani var ve 3 kere tekrarlandi
//                             ==> Kullanici 6'yi sordu ==> 6 array de yok

        int arr[] = {2, 1, 2, -3, 2};
        int eleman = 2;
        int counter = 0;// "flag" bazi durumlarin olup olmadigini kontrol etmek icin flag kullanilir
        for (int w : arr) {
            if (w == eleman) {
                counter++;
            }
        }
        if (counter > 0) {
            System.out.println(eleman + "array'de " + counter + " defa var ");
        } else {
            System.out.println(eleman + " array de yok");
        }

        // examples3) size verilen bi cumledeki en uzun kelimeyi bulunuz
        //           "Java kolaydir calisana, ne kolay ki calismayana"

        String sentence = "Javaaaaaaaaaaa kolaydir calisana, ne kolay ki calismayana";

        sentence.replace("\\p{Punct}", " ");

        System.out.println(sentence);

        String words[] = sentence.split(" ");// split methodu bize array verir

        Arrays.sort(words, Comparator.comparing(String::length));//java karsilastiricini kullan karsilastirmani Sting deki uzunluklarina gore yap

        System.out.println(Arrays.toString(words));//[ne, ki, Java, kolay, kolaydir, calisana,, calismayana]
        System.out.println(words[words.length - 1]);//


    }
}
