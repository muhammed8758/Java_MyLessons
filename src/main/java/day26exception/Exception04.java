package day26exception;

import java.util.Scanner;

public class Exception04 {
    public static void main(String[] args) {
        int age = 250;

        try{
            printAge(age);

            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }

    //Yasi Ekrana yazdiran bir method olusturunuz
    public static void printAge(int age) {
        if(age<0 || age>250) {
            throw new IllegalArgumentException("Yas negatif olamaz veya 250 den buyuk olamaz");
        }
        System.out.println(age);

    }
}
