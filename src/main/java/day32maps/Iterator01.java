package day32maps;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator01 {
    public static void main(String[] args) {
        List<String>myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");
        // for loop olusturarak her elemanin sonuna unlem isareti koyunuz
    //Loop lar kendi baslarina Collection lari update edemezler.
       // Bu eksigi gidermek icin Java iteretor lari olusturdu
        // Iteratorlar Collection lari update etmek icin kullanilir
        // Iteratorlar=loop diyebiliriz
        for(String w:myList){
            w=w+"!";
        }
        System.out.println("myList = " + myList);

        ListIterator<String> itr= myList.listIterator();// var olandan obje olusturma

        while(itr.hasNext()){
           String el= itr.next();
           itr.set(el+"!");
        }
        System.out.println(myList);

    }
}
