package day18arraylistspassbyvalue;

public class MethodOverLoading01 {
    /*
    Method OverLoading nasil yapilir
    1)Method isimleri ayni olmalidir
    2) Method Parametreleri farkli olmalidir
        i) parametre sayilari degistirilebilr
        ii)Parametrelerin data typlerini degistirebilirsin
        iii) Parametrelerin yerlerini degistirebilirsin
        Ancak data typleri farkli ise.
    3) Method ismi + parametreler = method signature methodun imzasidir.
    Method Signature disinda ne degistirirseniz degistirin Java o methodlari farkli kabul etmez.
     */
    public static void main(String[] args) {


        add(3,5);
        add(3,5.);





    }
    public static void add (int a, int b){
        System.out.println(a+b);
    }

    public static void add (int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void add (int a, double b){
        System.out.println(a+b);
    }
    public static void add (double a, int b){
        System.out.println(a+b);
    }


}
