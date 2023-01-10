package day17arraylists;

import day21accessmodifiersinheritance.Student;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Tacettin");
        System.out.println(names);

        List<String> cities = new ArrayList<>();

        cities.add("Trump");
        cities.add("Tom");
        cities.add("Tacettin");

        names.removeAll(cities);
        System.out.println(names);

        names.addAll(cities);// removeAll kullanildiginizda sadece ilk list degisir. Parantezin icindeki list degismez

        List<String> myNames = new ArrayList<>();

        myNames.add("Tom");
        myNames.add("Thomas");
        myNames.add("Tahsin");

        boolean sonuc1 = names.containsAll(myNames);// bir listin icinde coklu eleman olup olmadigini kontro eder hepsi varsa true en az 1 i yoksa false veriri
        System.out.println("sonuc1 = " + sonuc1);



        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        //Examplaes1) a lsinde "Shoes" eleamnin ilk gorunumunu siliniz

        a.remove("Shoes");
        System.out.println("a = " + a);

        // //Examplaes1) a lsinde "Shoes" eleamnin tum gorunumunu siliniz

        List<String> deleteds = new ArrayList<>();
        deleteds.add("Shoes");
        a.removeAll(deleteds);

        System.out.println(a);

        //Examples3 Bir tane salery listi olusturunuz eger salary 10000 de az ise %20 eger 10000 ve 10000 den cok ise %10 zam yapilsin

        List<Double> salary=new ArrayList<>();

        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);
       for(Double w : salary) {
           if(w<10000){
               salary.set(salary.indexOf(w),w*1.2);
               
           }else {
               salary.set(salary.indexOf(w),w*1.1);
           }
       }

        System.out.println("salary = " + salary);


        //Examples4) Iki Array in esit olup olmadigini kontrol ediniz

        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

//        //1.Yol
//        int counter=0;
//
//
//        for(int i=0; i<=m.size();  i++){
//           if( m.get(i)!=n.get(i)){
//                counter++;
//                System.out.println("Listler Esit degildir");
//                break;
//            }
//        }
//        if (counter==0){
//            System.out.println("Listler Esit");
//        }
//
//        //Example 4: İki ArrayList'in eşit olup olmadığını kontrol eden kodu yazınız.
//        //Note: İki ArrayList'in eşit olabilmesi için elemanlar eşit olmalı ve aynı elemanlar aynı index'te olmalı
//        List<Character> b = new ArrayList<>();
//        m.add('x');
//        m.add('y');
//        m.add('z');
//        m.add('t');
//        List<Character> c = new ArrayList<>();
//        n.add('x');
//        n.add('y');
//        n.add('z');
//
//        //1. Yol:
//        int counter1 = 0;//Flag
//
//        for (int i = 0; i < m.size(); i++) {
//            if (m.size() != n.size()) {
//                System.out.println("Listler eşit değildir.");
//                break;
//            } else if (m.get(i) != n.get(i)) {
//                counter1++;
//                System.out.println("Listler eşit değildir.");
//                break;
//            }
//        }
//        if (counter1 == 0) {
//            System.out.println("Listler eşittir.");
//        }

        // 2-yol

       boolean esitmi= m.equals(n);
        if(esitmi){
            System.out.println("listeler esit");
        }else{
            System.out.println("listler Esit Degil");
        }





    }
}
