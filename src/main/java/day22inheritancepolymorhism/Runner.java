package day22inheritancepolymorhism;

public class Runner {
    public static void main(String[] args) {

        //inheritance de veriableler secilirken Java objectin data tipine bakar
        //Oncelikle istediginiz variable i Object in data tipi olan Class da arar
        //Bulamazsa Parent Class larea bakar.
        //Hicbir paret class da bulamzsa hata verir




        Cat cat1=new Cat();
        System.out.println(cat1.a);//14
        System.out.println(cat1.b);//34
        System.out.println(cat1.c);

        Mammal cat2=new Cat();
        System.out.println(cat2.a);//13// mammal clasinda 13 oldugu icin

        Animal cat3=new Cat();
        System.out.println(cat3.a);//12

     //Object olustururken object in data tipi Child Claslardan secilemez
        // Inheritance de variableler secilirken Java Contructer a bakar.
        //Oncelikle istediginiz methodu Contructeri kullanilan Class dan alir
        // o Class da bulazmazsa Parent Class lara bakar
        Cat cat4=new Cat();
        cat4.eat();//Cat eat
        cat4.drink();// Mammal daki method un sout u oldugu icin yazdirmasyi ordan yapiyor method icinde yazdirma var zaten


        Mammal cat5=new Mammal();
        cat5.eat();


        Animal cat6=new Animal();
        cat6.eat();




    }
}
