package day18arraylistspassbyvalue;

public class Varargs01 {
    public static void main(String[] args) {

        /*
        1) Farkli sayilardaki parametreler ile calisabilen method olusturmak istedginizde "varargs" kullanmalisiniz
        2)Vararks arka planda "arrays"kullanir. Varargs ile calisirken Array ler ile calisiyormus gibi davranabilirsin
        3) Varargs olusturmak icn "<data Type>...<varargs ismi>"
        veya "<data Type> ...<varargs ismi>"
        4)Bir Method da "varaargs" in yaninda baska bir parametre kullanilabilir mi
        "varargs" en sonunda olmak suretiyle kullanilir.
        5) Bir method da birden fazla "varargs kullanilabilr mi
        Hayir kullanilmaz en sonunda olmak zorunda oldugu icin olmaz

         */


        int r1=add(2,3);
        System.out.println("r1 = " + r1);

        int r2=add(2,3,4,5);
        System.out.println("r2 = " + r2);

    }

//    // sayinin toplamini return eden bir method olusturunuz
//    public static int add(int a, int b) {
//        return a + b;
//    }
//
//    public static int add(int a, int b, int c) {
//        return a + b + c;
//
//
//    }

    //IStedigimiz kadar sayiyi toplayabilecegimiz method olusturalim
    public static int add( int ...a){//Varargs denir. Variable argument denir sinirsiz. Varargs in arkasinda Arrays calisir.
        int sum=0;
        for(int w : a){
            sum=sum+w;
        }
        return sum;

        //Varargs methodu muthis methodu


    }
}