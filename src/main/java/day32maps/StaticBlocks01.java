package day32maps;

public class StaticBlocks01 {
     public static double pi;
// static block lar ihtiyacimiz olan variablelerin class olusturma safhasinda elimizde olmasi saglar
    // static block lar class icindeki herseyden once calistirilir. "main method" dan ve diger tum methodlaran
    // once calistirilir.
    // static bloklar icinde sadece static variablelera deger atanabilir
    // Birden fazla static block varsa ustteki daha once calistirilir.
     static{

         pi = 3.14;
    System.out.println("static blok 1");
     }

    public static void main(String[] args) {
        System.out.println("main Method");

    }
    static {
        System.out.println("Static Block 2 ");
    }

}
