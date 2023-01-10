package day05ifsatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        //Example1) Kullanıcı gün numarasını girsin siz kod gün ismini yazsın
        // Pazar 1. gün Pazartesi 2. gün

        Scanner input= new Scanner(System.in);

        System.out.println("Gün Numaranızı Giriniz");
        byte gunNo=input.nextByte();

        if(gunNo==1){
            System.out.println("Pazar");
        }
        else if(gunNo==2){
            System.out.println("Pazartesi");
        }
        else if(gunNo==3){
        System.out.println("Sali");
        }
        else if(gunNo==4){
            System.out.println("Çarşamba");
        }
        else if(gunNo==5){
            System.out.println("Perşembe");
        }
        else if(gunNo==6){
            System.out.println("Cuma");
        }
        else if(gunNo==7){
            System.out.println("Cumartesi");
        }
        else{
            System.out.println("Geçerli Bir Gün Numarası Giriniz.");
        }




    }
}
