package day11loops;

public class Forloop02 {
    public static void main(String[] args) {
        // Examples1) Bır String dekı "m" hariç tum karakterlerı yazdır

        String str = "madam";
        //1. yol
        for (int i = 0; i < str.length() - 1; i++) {
            char c = str.charAt(i);

            if (c != 'm') {

            }
            System.out.println(c);
        }

        //2. yol
        for (int i = 0; i < str.length() - 1; i++) {
            char c = str.charAt(i);
            if (c == 'm') {
                continue;   //görmezden gel devame et ve i++ etmeye devam et sonlandırma

            }
            System.out.println(c);


        }
        //Examples2) 1 den 100 e kadar 6 ile bolünenler harıc tum tam sayıları ekrana yazdırınız

        for(int i=1;i<101;i++){
           if(i%6==0){
               continue;

           }
           System.out.println(i);
        }
        //Examples3) size verılen   bir stringdeki "m" den önceki karakterleri yazdırınız
        String s="Lüksemburg";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='m'){
                break; //LOOP u kırar
            }
            System.out.println(c);
        }

    }
}
