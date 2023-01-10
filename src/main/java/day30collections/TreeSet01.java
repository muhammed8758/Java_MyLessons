package day30collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {
    /*
    TreeSet tekrarsiz elemanlari "alfabetik" veya "kucukten buyuge" (natural Order) dizer

    TreeSet cok yavas calisir.
     */
    public static void main(String[] args) {

        //Examples ) 8 tane unique String elemani alfabetik sirada depolayiniz

        // Tekrarsiz elemanlari natural order da depolamak icin TreeSet kullanmak mantiklidir. Ama TreeSetler cok yavas calistigi icin biz
        // elemanlari once HashSet e depolariz sonra HashSet i TreeSet e cevirerek treeSet in yavas olma problemini asmis oluruz

       // 1.Yoll

        Long start1=LocalTime.now().toNanoOfDay();

        TreeSet<String> emails=new TreeSet<String>();
        emails.add("a@gmail.com");
        emails.add("y@gmail.com");
        emails.add("c@gmail.com");
        emails.add("m@gmail.com");
        emails.add("b@gmail.com");
        emails.add("z@gmail.com");
        emails.add("k@gmail.com");
        emails.add("d@gmail.com");
        System.out.println(emails);
        Long end1=LocalTime.now().toNanoOfDay();
        System.out.println(end1-start1);

//2. yol terci edilir interview sorusu meshur
        HashSet<String> myEmails = new HashSet<>();
        myEmails.add("a@gmail.com");
        myEmails.add("y@gmail.com");
        myEmails.add("c@gmail.com");
        myEmails.add("m@gmail.com");
        myEmails.add("b@gmail.com");
        myEmails.add("z@gmail.com");
        myEmails.add("k@gmail.com");
        myEmails.add("d@gmail.com");


        TreeSet myEmailsSorted = new TreeSet(myEmails);// HAshSet i TreeSet e cevirmek icin yazilan kod
        System.out.println(myEmailsSorted);
        Long end2=LocalTime.now().toNanoOfDay();

        System.out.println(end2-end1);




    }
}
