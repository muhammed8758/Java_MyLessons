package day26exception;

public class Exception01 {
    public static void main(String[] args) {

        String str="123";
        int result = convertStringToInteger(str);
        System.out.println(result+5);//123+5=128

        String st ="1a2b";
        int r =convertStringToInteger(st);//NumberFormatException eger icinde rakamdan farkli character barindiran bir Sstring i
                                           // valueOf() kullanarak Integer e cevirmek istersen NumberFormatException alirsiniz
        System.out.println(r+10);

    }
    public static  int convertStringToInteger(String str) {// Sringi Integer yaptik

        int i=0;

        try{
            //Herhangi bir satirda exception atilirsa Java drek catch bolumune gecer try icindeki sonraki kodlari calistirmaz
            i=Integer.valueOf(str);
            System.out.println("Burasi try Bolumu");


        }catch(NumberFormatException e){
            System.out.println("Rakam Olmayan Karakter iceren Stringler Integera cevirilemez "+ e.getMessage());
            e.printStackTrace();
            System.err.println("Hata Var");


        }
        return i;
    }
}
