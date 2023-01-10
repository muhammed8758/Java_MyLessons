package day32maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        //Examples01 Iterator kullanarak list elemanlarini tersten konsolo yazdiriniz

        ListIterator <String> itr = myList.listIterator();

        //hasNext() methodu pointer dan sonra eleman varsa "true" yoksa "false " return eder
        // next() methodu pointer i bir sonraki elamanin onune koyar ve ustunden atladigi elemani return eder
        while(itr.hasNext()){
            itr.next();  // pointer ensaga gelmis olur, next icine eleman yazmadigimiz icin
        }
        //hasPrevious() methodu pointer dan sonra eleman varsa "true" yoksa "false " return eder
        // previous() methodu pointer i bir sonraki elamanin onune koyar ve ustunden atladigi elemani return eder
        while(itr.hasPrevious()){
           String el= itr.previous();
            System.out.print(  el+" ");
            System.out.println();
        }

        //Examples02 LIsteki tum elemanlari siliniz
         while (itr.hasNext()) {
            itr.next();
            itr.remove();

        }
        System.out.println(myList);

         /*
         ListIterator da
         i) hasNext() , ii) next(), iii)set(), iv)hasPrevious(), v)previous(), vi)remove metodlari vardir

         Iterator da
         hasNext() , ii) next(), iii)remove methodlari vardir
          */

        List<String> yourList = new ArrayList<>();
        yourList.add("Z");
        yourList.add("K");
        yourList.add("A");
        yourList.add("J");
        yourList.add("M");

        Iterator<String> iterator = yourList.iterator();

        while (iterator.hasNext()){
          String kl=  iterator.next();
            System.out.println(kl);
        }











    }
}
