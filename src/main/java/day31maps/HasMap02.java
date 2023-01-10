package day31maps;

import java.util.HashMap;

public class HasMap02 {
    /*
    1) Biz HashMap<String, Double> salary = new HashMap<>(); bu kodu yazdigimizda Java memory de 16 bucket(kutu)
    iceren bir yapi olusturur ve bu yapidaki herbir kutuya index verir. Indexler 0 dan 16 e kadardir.
    2) Biz salary.put("QA",110000.00); kodunu yazdigimizda Java key icin bir HashCode olusturur.
    Bu HashCode u 16 e boler ve kalani index olarak kullanilir
    3) yerlestirirken 4 lu bir yapi olusturur, bu yapinin ilk bolumune "HashCode" u ikinci bolume "key" i,
    ucuncu bolumune "value" u ve dorduncu bolumune "pointer" i koyar. Bu cok bolumlu yapi LinkedList lerdeki Node dur.
    Yani HashMAp ler bucket leri koydugu datayi LinkList olarak depolar.
    4) Java null icin hep HashCode olarak zero uretir. O yuzden Key null oldugunda eleman ilk bucket e yerlestirilir.
    Bundan dolayi key si null olan elemanlar map in icinde genellikle ilk sirada gozukurler
    5) Java normalde HashCode lari unique yapar. Ama bazen trafik kazasi gibi iki eleman icin ayni HashCode uretebilir. Buna Hash Collision
    denir. Hash Collisiion meshur bir Java devolepment problemidir. Dev ler bu problemi cozmek icin kodlar yazarlar
    fakat bu core java nin konusu degildir.
     */
    public static void main(String[] args) {
        HashMap<String, Double> salary = new HashMap<>();

        salary.put("QA",110000.00);

        salary.put("DEV",130000.00);

        salary.put("SalesForce",125000.00);



    }
}
