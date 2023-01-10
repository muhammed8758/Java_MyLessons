package day06nestedifswitch;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /*
        Password ün ilk harfi büyük harf ise 'A' olursa geçerli password aksi halde geçersiz passworld
        Password ün ilk harfi küçük harf ise 'z' olursa geçerli password aksi halde geçersiz passworld

         */

        // Java nested kodları çalıştırırken çok zaman harcar. Buna time complexity
        //bu yüzden nestedif i kullanmayalım

        String pwd="Axy12!";

        char ilkHarf= pwd.charAt(0);

        if(ilkHarf>='A' && ilkHarf<='Z'){
            if(ilkHarf=='A'){
                System.out.println("Geçerli Password");
            }else{
                System.out.println("Geçersiz Password");
            }
        }else if(ilkHarf>='a'&& ilkHarf<='z'){
           if(ilkHarf=='z'){
               System.out.println("Geçerli Password");
           }else{
               System.out.println("Geçersiz Password");
           }
        }else{
            System.out.println("İlk Karakter Harf Olmalıdır");
        }

    }

}
