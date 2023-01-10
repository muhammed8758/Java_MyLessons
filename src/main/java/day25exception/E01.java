package day25exception;

public class E01 {
    /*
   1) Exception (istisnayi hata) java da kodlarimizi calistirirken meydana gelen beklenmedik durumlardir.
    2) Exception lar ile calismanin iki yolu vardir
        a) try-catch block kullanma ve exception olussa bile calismaya devam ettirme
        b) throw exception kullanarak calismayi durdurma (istenilmeyen bir hata oldugu zaman)
    3) Eger exception i handle etmez isek Java calismayi durdurur.
    4) try catch kullanirken try kodunu bir yada birden fazla catch ile birlikte kullanabiliriz
    5) try catch olmaksisin tek basina kullanilamaz
    6) Eger yazmis oldugumuz herhangi bir kod satirinda problem olabilecegini dusunuyorsaniz try catch blok icine koymalisiniz
    7) catch blok parantezi icerisine olmasi muhtemel exception class ismi yazilir
    8) e.getMessage() bu methodu kullanarak hatanin neyden kaynaklandigini veren teknik mesaji goruruz
        System.out.println(); burada yazmis oldugum mesajlar teknik mesajlar degildir
        e.printStackTarace(); methodu teknik mesaj gosterir. kod calismaya devam eder
        System.err.println(); hata mesajini renkli olarak verir. Bu sayede cosole da diger ciktilardan ayirmak icin kullanilir

    9)Eger try{} body icerisindeki kod sorunsuz calisirsa catch blok devreye girmez
     */
    public static void main(String[] args) {
//        divide(6,2);//3
//        divide(0,2);//0
//        divide(6,0);

        divide2(5,0);

    }
    //1.yol tavsiye edilmez
    // Bir DEV icin tum matematik bilgilerini bilmek mumkun degildir
    public static void divide(int a, int b){// static olmazsa static cagirmaz
        if(b==0){
            System.out.println("Bir Sayi Sifir ile Bolunemez");
        }else{
            System.out.println(a/b);
        }



    }
    // try-catch kullanilarak exception u handle etmek tavsiye edilir

    public static void divide2(int a, int b){
        try{
            System.out.println(a/b);
        }catch(ArithmeticException e){
            System.out.println("Bolme Isleminde Bir Problem Var" + e.getMessage());
            e.printStackTrace(); // java detayli teknik mesaj verir // program calismaya devam eder
            System.err.println(" Bolme Hatasi");// kirmizi renkli yazdiriyor

        }

        //Note Java Matematik ile alakali exception lari AritmeticException a koymustur.

    }
}