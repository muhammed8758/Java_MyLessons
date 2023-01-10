package day30collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
    /*
    LinkedHasSet ler elemanlari ekleme sirasina gore yerlestirirler. (insertion Order)

    LinkedHashSet elemanlari siralamada zaman harcadigi icin HashSetlere gore yavas calisir.
    
     */
    public static void main(String[] args) {
        
        LinkedHashSet<String> emails =new LinkedHashSet<>();
        emails.add("abc@gmail.com");
        emails.add("bvc@gmail.com");
        emails.add("poc@gmail.com");
        emails.add("akm@gmail.com");
        emails.add("hbc@gmail.com");
        System.out.println("emails = " + emails);

    }
}
