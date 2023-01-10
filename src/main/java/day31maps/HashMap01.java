package day31maps;

import java.util.*;

public class HashMap01 {
    /*
     1) Map ler Key = Value structer ini kullanilirlar
     2) Map ler de Key kismi unique tekrarsiz yapi icermelidir.
     3) value kismi tekrarli data icerebilir non unique dir
     4) key kisminda null tekrarsiz olarak kullanilir
     5) value kisminda null kullanilabilir. ve bir cok kez null kullanilabilir
     6) Map in elemanlarina "EntrySet" keyword u kullanilir. kisaca entry denebilir
     7) HashMap ler siralama ile ugrasmazlar. Cok hizli calisirlar SuperFAst lerdir. Rastgele siralar
     8) HashMap ciktilarda suslu parantez verir


     */
    public static void main(String[] args) {
        HashMap<String, Integer> studentAges = new HashMap<>();
        studentAges.put("Muhammed",35);
        studentAges.put("Tom",21);
        studentAges.put("Ayse",20);
        studentAges.put("Brad",12);
        studentAges.put("Veli",36);
        studentAges.put("Veli",15); // overwrite yapti
        studentAges.put(null,66);
        studentAges.put("Ayhan Isik",null);
        studentAges.put("Sadri Alisik",null);

        System.out.println(studentAges);

        //Map dan sadece key ler nasil alinir
        
        Set<String> keys = studentAges.keySet();// bu sekilde
        System.out.println(keys);
        
        //Map dan sadece value ler nasil alinir
        
        Collection<Integer> values = studentAges.values();
        System.out.println("values = " + values);

        //Belli bir key e aitvalue nasil alinir

        Integer ayseAges=studentAges.get("Ayse");
        System.out.println(ayseAges);

        //Examples1) Tum Integer yaslarin ortalamasini hesaplayan kodu yaziniz

        Collection<Integer> avarage=studentAges.values();
        int sum=0;
        double counter=0;

        for(Integer w : avarage){
            if(w!=null){
                sum+=w;
                counter++;

            }
        }
        System.out.println("Ortalama Yas "+ (sum/counter));

        // Examples2) A ile baslamayan isimlerin icerdigi toplam karakter saysini bulan kodu yaziniz

        Set<String> ch = studentAges.keySet();

        int toplam=0;
        for(String w: ch){
            if(w!=null && w.startsWith("A")){
                toplam+=w.length();

            }
        }
        System.out.println(toplam);

        boolean result = studentAges.remove("Tom",21);// remove("Tom",21) siler ve boolean doner
        System.out.println(result);

        Integer result1= studentAges.remove(null);
        System.out.println(result1);

        // Key varsa value yi ver yoksa bana atanilan degeri verir

        Integer result2 = studentAges.getOrDefault("Muhammed",0);
        System.out.println(result2);

        Integer result3 = studentAges.getOrDefault("Haci",0);
        System.out.println(result3);

        //Key yoksa Map e ekle  key varsa Map e herhangi bir ekleme yapma

        Integer result4 = studentAges.putIfAbsent("Hasan", 58);
        System.out.println(result4);// value null ise ekleme yapar degilse yapmaz
        System.out.println("studentAges = " + studentAges);

        //replace methodu value leri degistirmek icin kullanilir
       Integer result6 = studentAges.replace("Muhammed",45);
        System.out.println(studentAges);

        studentAges.replace("Muhammed",45,80);
        System.out.println("studentAges = " + studentAges);



        //Examples3) Map deki her bir entry i farkli bir satirda olacak sekilde yazdiriniz

        //entrySet() methodu map deki entry leri bir set in icine koyarak size verir. loop kullanilabilir artik
        Set<Map.Entry<String,Integer>> entries =studentAges.entrySet();
        for(Map.Entry<String,Integer> w : entries){
            System.out.println(w);
        }








    }

}
