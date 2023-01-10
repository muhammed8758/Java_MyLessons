package day32maps;

import java.util.HashMap;
import java.util.Scanner;

public class Deneme {
    //Size verilen bir cumledeki her kelimenin kac kere kullanildigini yazan kodu yaziniz

    //"I like to move it, move it."==> I=1, like=1, to=1, meve=2, it=2
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen tekrarli bir cumle giriniz");



        String atm = scan.nextLine();
        atm = atm.replaceAll("\\p{Punct} ", " ");
       String[] ctm= atm.split(" ");

        HashMap<String, Integer> gor=new HashMap<>();

        for(String w: ctm){
            Integer gorSayisi=gor.get(w);
            if(gorSayisi==null){
                gor.put(w,1);
                
            }else{
                gor.put(w,gorSayisi+1);
            }
        }
        System.out.println("gor = " + gor);

    }
}