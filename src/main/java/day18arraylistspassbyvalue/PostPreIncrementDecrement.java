package day18arraylistspassbyvalue;

public class PostPreIncrementDecrement {// sertifika sinavlarinda cikar
    public static void main(String[] args) {
        int a=5;
        
        //Post Increment 
        int b=a++;
        System.out.println("b = " + b);//5
        System.out.println(a);

        //Pre Increment
        int c=10;
        int d=++c;//11
        System.out.println("d = " + d);//11


        //Post Decrement

        int e=20;
        int f=e--;
        System.out.println("f = " + f);//20
        System.out.println(e);

        //Pre-increment
        int h=30;
        int i=--h;
        System.out.println("i = " + i);//29
        System.out.println("h = " + h);//29


        
    }
}
