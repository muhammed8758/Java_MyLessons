package day06nestedifswitch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        /*Kullanıcıya ay ismi sorunuz ve kullanıcının verdiği ay ismınden son aya kadar yazınız

         */
        /*tolowecase kullanıcıdan alınan kelimeyi küçük harfe çevirir
        to uppercase kullanıcıdan alınan kelimeyi büyük harfe çevirir
         */

        System.out.println("Ay İsmi Giriniz");
        String ayIsmi=input.next().toLowerCase();
        switch (ayIsmi){

            case "ocak":
                System.out.println("ocak");
            case "şubat":
                System.out.println("şubat");
            case "mart":
                System.out.println("mart");
            case "nisan":
                System.out.println("nisan");
            case "mayıs":
                System.out.println("mayıs");
            case "haziran":
                System.out.println("haziran");
            case "temmuz":
                System.out.println("temmuz");
            case "ağustos":
                System.out.println("ağustos");
            case "eylül":
                System.out.println("eylül");
            case "ekim":
                System.out.println("ekim");
            case "kasım":
                System.out.println("kasım");
            case "aralık":
                System.out.println("aralık");
                break;
            default:
                System.out.println("geçerli ay ismi giriniz");










        }

    }

}
