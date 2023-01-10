package day29abstractioncollection;

public interface Engine extends Vehicle{
    //Child       Parent
    //Class      ---> interface ===> implements
    //Class      ---> Class ===> extends
    //inteface   ---> interface ===> extends
    // interface ---> class ===> mumkun degil boyle bisy yok

    //interface lerdeki tum variableler otomatik olarak (default) public dir.
    //interface lerdeki tum variableler otomatik olarak (default) final dir.
    //interface lerdeki tum variableler otomatik olarak (default) static dir.

    //"interface"lerde constractor olmadigi icin interface lerden object olusturulamaz
    //"abstract class" larda class olduklari icin constractor varfir. Ama constractorlar abstract classlarda object olusturmazlar

    int price=2000;

    double weight=23.5;

    void run();





}
