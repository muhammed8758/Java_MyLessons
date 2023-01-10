package day28abstraction;

public class Cat extends Mammal{

    /*
    Bir method parent abstract method ise child class o method u override edip kullamak zorundadir.
    Bu yuzden herhangi bir fonksiyonu child class icin mecburi yapmak isterseniz o methodu abstract yapmak zorundasin

     */
    @Override
    public void eat() {
        System.out.println("cats eat");

    }

    @Override
    public void move() {
        System.out.println("cats move");

    }
}
