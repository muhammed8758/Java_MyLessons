package day25exception;

public class E03 {
    public static void main(String[] args) {

        String str="Ali";
        getNumOfChars(str);//3

        String s="";
        getNumOfChars(s);//

        String t=null;
        getNumOfChars(t);//Eger length() methodunda null kullanirsaniz exception alirsiniz



    }
    //Bir String de bulunan karakterlerin sayisini bulabilmek icin bir method olusturunuz
    public static void getNumOfChars(String str){

        try{
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("length() methodunda Hata " + e.getMessage());
            e.printStackTrace();
            System.err.println("Hata var Kardesim Baksana");

        }
    }
}
