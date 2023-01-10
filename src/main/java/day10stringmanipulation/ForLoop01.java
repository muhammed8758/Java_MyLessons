package day10stringmanipulation;

public class ForLoop01 {
    public static void main(String[] args) {
        /*
        loop ) Tekrarli isler icin loop kullanilir
        Dort Cesit loop var
        1)for loop
        2)while loop
        3)do-While-loop
        4)for each loop
         */
        //1) for-loop
        //Examaples) Ekrarna 5 kere Hi yazdiriniz
        // BaslangicDegeri Loop hangi sart altinda calisacak Increment(Artirma) veya Decrement(Azaltma)
        for( int i=1       ;             i<6                 ;             i++                     ){
            System.out.println("Hi");                               //i*=3' i+=2
                                                                    //k-- , k/=2

        }
        //Examples2) 4 den 7 ye kadar tum tamsayilari ekrana yazdiran kadu yazdiriniz
        for(int i=4;i<8;i++){
            System.out.print(i+" ");

        }
        //Examples3) 14 den 5 e kadar
        for(int i=14;i> 4;i--){
            System.out.print(i+" ");
        }
        //Examples5) 14 den 5 e kadar tum cift sayilari yazdfir
        //1.yol
        for(int i=14;i>4;i-=2){
            System.out.println(i);
        }
        //2.yol
        for(int i=14;i>4;i--){
            if(i%2==0){
                System.out.println(i);
            }
        }
        //Examples6) 28 den 157 e kadar tum tek sayilari ekrana yazdirin

        for(int i=28;i<158;i++){
            if(i%2!=0){
                System.out.println(i);

            }
        }
        //Examples7) Java Stringini "J*a*v*a" Stringine ceviren kodu yaziniz.
        String s = "Java";
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i)+"*");
        }
        //Example 8: Size verilen String'de tekrarsiz karakterleri ekrana yazdiriniz
        //           "Hellooo Ali" ==> He Ai
        String sv = "Hellooo Ali";
        for(int i=0; i<sv.length(); i++){
            char c = s.charAt(i);
            if(sv.indexOf(c)==s.lastIndexOf(c)){
                System.out.print(c);//He Ai
            }
        }

    }




}
