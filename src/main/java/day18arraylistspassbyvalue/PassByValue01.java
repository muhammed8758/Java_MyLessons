package day18arraylistspassbyvalue;

import java.util.Arrays;

public class PassByValue01 {
    public static void main(String[] args) {
        /*
        1) Java variablelerin orjinal degerini korumak ister.
        2) Variable methodlar icinde kullanildiginda, Java methodun icine orjinal degeri koymaz, o degerin kopyasini uretir.
        ve methoda kopyasini yollar. Method kopya ustunde degisiklik yapar. Dolayisyla variablenin orjinal degeri korunmus olur.
        Bu sisteme "Pass By Value" denir.
        Note: Java "pass By Value" kullanir.
        Bazi programlama dilleri orjinal degeri koruma altina almamistir. Bu isi devoloperlara birakmistir.
        Bu tarz diller "pass by Referance" kullanir.

         */

        int x=5;// Orjinal deger
        System.out.println( x);

        // static method olan main methodun icindeki herseyin static olmalidir

        change(x);// hahfif italik olmasi static olmasindan  burdaki x kopya x
        System.out.println( x);// orjinal deger

        int ucret=100;
       int kopya= indirim(ucret);
        System.out.println(kopya);


    }

    public static void change(int a){
        System.out.println(a*3);

    }// void disindaki return typlarda method body si icerinde return keywoerd kullanlimalidir
    public static int indirim(int gomlekUcreti){
        return gomlekUcreti-10;
    }
}
