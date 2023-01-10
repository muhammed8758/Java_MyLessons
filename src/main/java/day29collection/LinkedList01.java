package day29collection;

import java.util.LinkedList;

public class LinkedList01 {
    /*
 1)LinkedList'deki her eleman iki bölümden oluşur. i)Data ii)Pointer
2)LinkedList'deki her bir eleman "Node" olarak adlandırılır.
3)LinkedList'ler eleman ekleme ve eleman silme işlemlerinde çok başarılıdırlar.
4)LinkedList'ler eleman arama işlemlerinde başarısızdırlar.
5)3. ve 4. maddelerden dolayı eleman ekleme ve eleman silme işlemlerinin çok yapılacağı durumlarda LinkedList kullanılmalıdır.
6)ArrayList'ler index kullanır LinkedList'ler index kullanmaz.
7)index kullanmak eleman bulma işlemlerinde çok başarılıdır, bu yüzden eleman bulma işlemlerini çok yapacaksanız ArrayList kullanmalısınız.

    ArrayList ler index kullanir. Ama index kullanmak eleman ekleme ve eleman silme islemlerinde bize zaman kaybettirir.

    ArrayList eleman bulma (search) islemlerinde cok basarilidir.

    LinkedList search islemlerinde basarisizdir. Ekleme cikarma islemi cok yapilan islemlerde kullanilacak


     */

    public static void main(String[] args) {
        LinkedList<String> visitors=new LinkedList<>();
        visitors.add("Tom");
        visitors.add("Hanks");
        visitors.add("Tom Hanks");
        visitors.add("Brad");
        visitors.add("Pitt");
        visitors.add("Brad Pitt");
        visitors.add(2,"Angelina Jolie");
        visitors.addLast("Ajda Pekkan");
        visitors.addFirst("Cuneyt Arkin");
        visitors.removeLast();
        visitors.removeFirst();
        visitors.add("Brad Pitt");
        visitors.add("Tom Hanks");
        visitors.removeFirstOccurrence("Tom Hanks");// ilk gorunum u sil demek
        visitors.removeLastOccurrence("Brad Pitt");


        System.out.println(visitors);



        //LinkedListler ekleme ve cikarma islamei fazla yaptigi icin methodlar da fazladir.
        /*
        Removes the first occurrence of the specified element in this list
        This method is equivalant to removeFirst().
        Throws : NoSuchElementException - if this list is empty


         */
        String firstEl=visitors.pop();// Cut+Paste ===>ctrl+X
        System.out.println(firstEl);
        System.out.println(visitors);

        LinkedList<String> myList=new LinkedList<>();
        //myList.pop();






    }
}
