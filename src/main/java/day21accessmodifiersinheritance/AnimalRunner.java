package day21accessmodifiersinheritance;

public class AnimalRunner {// runner larin icine main method konulur

    /*
   1) Inheritance sayesinde
    i) kod tekrarlarindan kurtuluruz
    ii) kod tamiri (maintanence) kolay olur
    iii) child class lari daha atomik yapmis oluruz

    2) Bir Class i baska bi Classin child class i yapmak icin "extend" keyword u kulanilir
    Ilk yazilan class Child ikinci yazilan Class parent olur

    3) Child Class object leri Parent Class dan method ve variableleri kullanabilirler.

    4) Parent Class Objeleri child Class dan method variableleri kullanamazlar

    5) Object Class her Classin parentidir. Javada Object Class haric her class in parenti vardir

    6) "Private" method ve variableler inheritance de kullanilamazlar

    7) "Protected" method and variables inheritance edilebilirler

    8)" default" method and variables ayni package lerde  inheritance edilebilirler

    9) "Public" method and variables inheritance edilebilirler

    10) 4 tip inheritance vardir
        i) Multilevel Inheritance: Java bunu kabul  eder
        ii)Hierarcihal inheritance : Bir parent icin coklu child java bunu kabul eder
        iii) Multiple Inheritance :  Bir childe coklu parent  Java bunu desteklemez
        iiii) single Inheritancve : Bir Childe bir parent java bunu destekler


     */
    public static void main(String[] args) {

        Cat c1=new Cat();

        c1.eat();
        c1.drink();
        c1.meow();

        Dog d1=new Dog();

        d1.bark();
        d1.eat();
        d1.drink();


        Monkey m1=new Monkey();
        m1.eat();
        m1.drink();
        m1.climb();







    }

}
