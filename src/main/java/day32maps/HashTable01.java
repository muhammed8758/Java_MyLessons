package day32maps;

import java.util.Hashtable;

public class HashTable01 {
    /*
    1)HashTable bir Map dir
    2)HashTable entrySet leri herhangi bir siralamaya tabi tutmaz
    3)HashTable HashMap lerden daha yavastr. Cunku thread-safe ve syncronize dir. /Ayni zamanda birden cok is yapmak
    4)Hashtable lerde Key null olmaz NullPointerException verir
    5)HashTable lerde value null olamaz NullPointerException verir
    6)HashTable ile HasMap ler arasinda ki fark.
       i) HashTable ler thead safe dir HasMAp ler degil.

     Note : to String() methodu objeleri consol da detaylari ile gorebilmek icin class larin icerisinde olusturulur.
            toString() method'unu olusturmadan object'i console'a yazdirirsaniz Java o object'in address'ini yazdirir.
     */
    public static void main(String[] args) {
        Hashtable<String, Integer> countryPopulations = new Hashtable<>();
        countryPopulations.put("USA", 400000000);
        countryPopulations.put("Germany", 83000000);
        countryPopulations.put("Turkey", 90000000);
        System.out.println(countryPopulations);

        // countryPopulations.put(null,900000);

        //  countryPopulations.put("france", null);

        Hashtable<String, Students>  myStudents= new Hashtable<>();

        myStudents.put("Math",new Students("Tom Hanks", "th@gmail.com",21,true));
        System.out.println(myStudents);

        String name=myStudents.get("Math").name;
        System.out.println(name);
        
        int age=myStudents.get("Math").ages;
        System.out.println("age = " + age);

    }
}
