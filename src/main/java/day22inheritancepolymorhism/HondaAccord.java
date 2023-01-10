package day22inheritancepolymorhism;

public class HondaAccord extends Honda {

    /*
   1) Siz Class olusturdugunuzda Java otomatik olarak size Constructer verir.
    Cunku Java Class in bir kalip oldugunu ve Object olusturmak icin yaratildigini ve Object olusturmak
    icin Constructer in sart oldugunu bilir.
    2) Java nin otomatik olarak olusturdugu bu gorunmez Constructer a default Constructer denir
    3) Siz kendiniz herhangi bir Constructer olusturdugunuzda Java default constructor i siler
    4) Bir Class da birden fazla constructor olabilir
    5) "This.price" gibi syntaxi sadece Constructer larin icinde kullanilir
    6) Constructer lar Constructer kullanarak variableler uzerinde yaptiginiz degisimler sadece Object uzerindeki variablelerin degerlerini degistirir
    // Clasdaki variable degerlerini degistiremez

     */

    public int price;
    public int year;
    String make;
    String model;

    public HondaAccord() {// Gorunmeyen Constructeri gorunur hale getirme

    }

    public HondaAccord(int price) {
        this.price = price;

    }
    public HondaAccord(int price, int year) {

        this.price=price;
        this.year = year;
        System.out.println("Honda Accord Constructer");

    }
    public HondaAccord(int price, int year, String make, String model) {
        this.price=price;
        this.year=year;
        this.make=make;
        this.model=model;



    }



}
