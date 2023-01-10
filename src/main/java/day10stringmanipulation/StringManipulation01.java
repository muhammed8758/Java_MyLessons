package day10stringmanipulation;

public class StringManipulation01 {
    public static void main(String[] args) {
        String a = "Java kolaydir";
        //startsWith("kola" , 5) kodu ilk 5 karakterden sonraki Stringe bakar ve o String in "kola" ile baslayip baslamadigini kontrol eder
       boolean b = a.startsWith("kola",5);//5. karakterden sonra ne ile basliyor
        System.out.println("b = " + b);

        //replaceFirst("a","*"); ko String deki ilk "a" yi "*" a cevirir
        //replace("a","*"); ko String deki tum "a" yi "*" a cevirir
       String c = a.replaceFirst("a","*");
        System.out.println(c);

        //concat(" ") iki Stringi bir birine yapistirmaya yarar
        //Concanitation islemi iki turlu yapilabilir i) + ile ii) concat() ile
        // Java bir islem icin method uretmis ise o methodu kullanmak "best practise" dir
        //sadece sona ekler
        String d = c.concat(" anladin mi?");
        System.out.println(d); //Java kolaydir anladin mi


        String e = "   Tom Hanks    ";
        String f = e.trim();// Bir StringIn  bas ve sonundan "  " space leri  keser. Ortadakilerine dokunmaz
        System.out.println(f);//Tom Hanks


        String h = "Java";
        String i = "java";
        //Iki Tane String i alfabetik(lexicografic) olarak karsilastirir
        //Buyuk Harf kucuk harfe duyarlidir
        int k= h.compareTo(i);//h-i alfabetik sirasi cikartilir
        System.out.println(k);

        String l = "Java";
        String m = "java";

        int n= l.compareToIgnoreCase(m);//Buyuk harf kucuk harfe duyarli degildir
        System.out.println(n);


        String p = a.repeat(-3);// repeat methodu stringi 3 kere tekrarlar
        System.out.println( p);//Java kolaydirJava kolaydirJava kolaydir








    }
}
