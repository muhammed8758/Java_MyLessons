package day30collections;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Chris");
        names.add("Alexandra");
        names.add("Mark");
        names.add("Tom");
        names.add("Jaremy");
        names.add("Hans");
        System.out.println(names);

        /*
                Retrieves, but does not remove, the head (first element) of this list.
                Returns: the first element of this list or "null" if this list is empty

         */

        String firstEl = names.peek();
        System.out.println(firstEl);

        LinkedList<String> myList = new LinkedList<>();

        String first = myList.peek();// ilk elemani silmeden gormeki icin
        System.out.println(first);//null


       /*
             Retrieves and removes the head (first element) of this list.
             Returns:the head of this list, or null if this list is empty
        */

        String firstElement = names.poll();
        System.out.println(firstElement);//Chris  // ilk elemenet i sildi ve asagida gosterdi

        System.out.println(names);//[Alexandra, Mark, Tom, Jaremy, Hans]

/*
        Retrieves, but does not remove, the head (first element) of this list.

        Throws: NoSuchElementException – if this list is empty

 */
        String f = names.element();
        System.out.println(f);
        System.out.println("names = " + names);


        /*
        Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
        Returns: the first element of this list, or null if this list is empty
         */
        names.peekFirst();

        //Examples1) A ile baslayan tum isimleri "*****" e  cevirniz

        LinkedList<String> studends = new LinkedList<>();
        studends.add("Chris");
        studends.add("Alexandra");
        studends.add("Mark");
        studends.add("Tom");
        studends.add("Jaremy");
        studends.add("Hans");

        for (String w : studends) {
            if (w.startsWith("A")) {
                studends.set(studends.indexOf(w), "******");
            }


        }
        System.out.println(studends);//[Chris, ******, Mark, Tom, Jaremy, Hans]

        //Examples2) Listdeki 4 harften cok harf iceren isimleri siliniz

        // interview sorusu

        LinkedList<String> clear = new LinkedList<>();
        clear.add("Chris");
        clear.add("Alexandra");
        clear.add("Mark");
        clear.add("Tom");
        clear.add("Jaremy");
        clear.add("Hans");

        for (int i = 0; i < clear.size(); i++) {
            if (clear.get(i).length() > 4) {
                clear.remove(studends.get(i));
                i--;
            }

        }
        System.out.println(clear);
    }


}





