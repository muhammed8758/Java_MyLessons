package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Ex1) Bir String deki sesli harflerin sayisini bulan kodu yaziniz
        //      a-e-i-o-u-A-E-I-O-U

        String str= "Java ogrenince para kazanmak kolay, ogrenmeyince ne kolay ki.";
        str=str.toLowerCase();// buyuk kucuk harfe duyarli olmasin diye
        String harfler[]=str.split("");// split methodu her zaman Array verir
        int counter=0;
        System.out.println(Arrays.toString(harfler));

        for(String w:harfler){
            switch (w){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;


            }
        }
        System.out.println(counter);



    }
}
