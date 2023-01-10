package day03Typecastingwrapperscanner;

public class TypeCasting01 {
    /*Bir bümerik data type ni diğer nümerik data type ne çevirme demektir.
                byte<short<int<long<float<double

    Büyükden>Küçüğe giderken Auto widening denir
    Küçükten > Büyüğe giderken Explicit Narrowing denir

          */

    public static void main(String[] args) {

        byte age =23;
        int newage= age;

        long population =12344598989659L;
        int newPopulation = (int)population;

        //Exaple1) shortu double çevir
        //            flout byte yapın

        short numOfStudents = 45;                   //Auto widenning
        double newNumOfStudents= numOfStudents;

        float price=12.99F;
        byte newPrice=(byte)price;              //Explicit Narrowing

        System.out.println(newPrice);   //Java ondalık sayıyı Tam Sayıya çevirirken ondalık kısmını siler

        int number=515;
        byte newNumber=(byte)number;
        System.out.println(newNumber);//3     Java 515 i (-128 ile 127) 256 ya böldü kalanı return etti

        int num =510;
        byte newNum=(byte)num;
        System.out.println(newNum);// -2






    }




}
