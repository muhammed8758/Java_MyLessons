package day24statickeywordencapsulation;

public class CarRunner {
    /*

static keyword nedir?
static keyword class'a baglanmis class elemanlaridir
static class elemanlari butun Object'lerin ortak elamanidir.
static ler uzerinde yapilan her degisiklik butun objeleri etkiler tum objelerde gorunur.
static Class elemanlarina Class uzerinden ulasilir.
staticler override edilmezler musade etmez

 */

    public static void main(String[] args) {

        Car_Static car1=new Car_Static();
        Car_Static car2=new Car_Static();
        Car_Static car3=new Car_Static();
        Car_Static car4=new Car_Static();



        //Static variable lar objeleri kulanrak ulasmak mumkun ama tavsiye edilmez
        System.out.println(Car_Static.counter);
        //static variablelara class ismi kullanarak ulasilmalidir.
        System.out.println(car1.price);


        System.out.println(Car_Static.counter);

        System.out.println(car2.price);

        System.out.println(Car_Static.counter);
        System.out.println(car3.price);

        System.out.println(Car_Static.counter);
        System.out.println(car4.price);




    }
}
