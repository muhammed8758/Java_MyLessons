package day30collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {
    /*
    Ilk giren elemani ilk kullanmaniz gerektiginde Queue kullnamk en iyi secimdir. FIFO
    Queue da eleamnlar "insertion order " a gore dizilirler
    Queue da  peek(), element(), remove(), gibi ilk elemani ilgilendiren  pek cok method vardir.
    offer() methodu kapasite kontrolu yapildikdan sonra eleman ekleme durumlarinda kullanilir.
     */
    public static void main(String[] args) {
        Queue<String> wareHouse = new LinkedList<>();

        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Honey");
        wareHouse.add("Tomatoes");
        System.out.println(wareHouse);
/*


        Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
         When using a capacity-restricted queue, this method is generally preferable to add,
         which can fail to insert an element only by throwing an exception.

        Returns:
        true if the element was added to this queue, else false
        Throws:
        ClassCastException – if the class of the specified element prevents it from being added to this queue
        NullPointerException – if the specified element is null and this queue does not permit null elements
        IllegalArgumentException – if some property of this element prevents it from being added to this queue


 */
        wareHouse.offer("Potatoes");
        System.out.println(wareHouse);





















    }
}



