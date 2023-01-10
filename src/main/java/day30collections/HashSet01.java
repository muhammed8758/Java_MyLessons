package day30collections;

import java.util.HashSet;

public class HashSet01 {
    public static void main(String[] args) {
        // Hash bir teknikdir. birbirine benzemeyen kodlar uretir. Bu kodlar datayi unique yapar
        // Set lere coklu ama tekrarsiz data depolamak istedigiizde ihtiyac duyariz
        // HashSetler eklenen elemanlarin siralanmasi icin ugrasmaz bu yuzden cok hizli calisir
        // HashSet ler index kullanmazlar. Cunku rastgele yapildigi icin index mantikli olmaz


        HashSet<String> emails=new HashSet<String>();
        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        System.out.println("emails = " + emails);//emails = [Apple, Fig, Mango, Apricot, Orange]

        //Varolan elemani eklerseniz hata vermez. Son ekleneni var olan datanin uzerine yazar. Overwrite yapar
        emails.add("Mango");
        System.out.println("emails = " + emails);
        // setler coklu ama tekrarsiz datalari depolamaya yarar. ayni datayi eklemek istedigizde overwrite yapar

        emails.add(null);
        emails.add(null);
        emails.add(null);
        System.out.println("emails = " + emails);//emails = [null, Apple, Fig, Mango, Apricot, Orange]


    }
}
