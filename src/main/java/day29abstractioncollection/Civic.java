package day29abstractioncollection;
/*
   Abstract methodlar sadece ne yapilacagini soyler(What to do)
   Concreate methodlar ne yapilacagi ile birlikte nasil yapilacagini da soyler(How to do)

   "interface"ler bir yapilacaklar lestesidir. (to do list)

   multiple parent interface kullandiginiz da ayni method ismii ile birden fazla method olusturursaniz
   Bu methodlarin return typleri ayni olmalidir. Aksi takdirde hata verir

   Soru "Abstract Class ile Interface in farklari nedir /// interviev sorusu meshur
    1)Method
        "Abstract Class" hem abstract hem de concreate methodlar icerebilir
        "Interface" ler ise sadece abstract methodlar icerir
        Ama istersek interfaceler de "default" ve static" keyword lar kullanilarak concreate methodlar olusturulabilir

    2) Variable
        "Abstract Class" larda normal Class lardaki gibi her turlu variable olusturulabilir
        "interface" lerde ise variableler public static ve final olmak zorundadir.

     3) inheritance
        "Abstract Class" lar class olduklari icin multiple inheritance a musade etmezler
        "Inheritance" ler ise multiple inheritance i desteklerler asil nedeni budur.

     4) Object Creation
      "Abstract Class" larda constructer vardir ama object olusturmada kullanilmazlar.
      "interface lerde ise constructor olmadigi icin object olusturulmaz


    */

        // Opject Oriented Programing Language prensipleri nelerdir?
   // 1) inheritance  2) Polymorphism 3) Encapsulation 4) Abstraction  dir. Bunlari aciklayarak anlatmamiz gerekmektedir.


public class Civic implements Engine,Ac{


    @Override
    public void run() {
        System.out.println("civic runs well");

    }


}
