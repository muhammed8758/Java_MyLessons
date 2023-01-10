package day28abstraction;

public abstract class Animal {

    //Body si olmayan methodlar Abstract method olarak adlandirilir.
    //Bir methodu abstract method yapmak icin I) Method body sil ii) "abstract"  keyword kullan
    // "abstract" methodlar abstract class icinde olmalidir
    public abstract void eat();

    //"abstract" method lar da hem "abstract" method hem de "concreate" method kullanilir
    public void drink(){
        System.out.println("Animals drink..");

    }

    public abstract void move();




}
