package day11loops;

public class ForLoop01 {// BU SORUYU COK IYI ANLA

    public static void main(String[] args) {
        //Exampeles1) 3 den 6 ya kadar tamsayıların toplamını bulan kodu yazın
        int sum = 0;
        for (int i = 3; i < 7; i++) {
            sum = sum + i;
            // System.out.println(sum); loop un ıcınde olursa sıralı toplamayı yapar

        }
        // System.out.println(sum); buraya yazdırırsa son değer gösterır
        System.out.println(sum);

        //Examples2) 6 dan 3  ekadar tamsayıların carpımını bulun

        int multiply = 1;//multiply çarp demektir
        for (int i = 6; i > 2; i--) {
            multiply = multiply * i;

        }
        System.out.println(multiply);

        //Examples3) size verılen bır tamsayının rakamları toplamını bulunuz

        int num = 385;
        num = Math.abs(num);
        int sonuc = 0;
        //java da tamsayıyı tamsayıya bolersenız sonuc tamsayı olur.eğer sonuç vırgullu sayı ıse java ondalık kısmını sıler
        //385%10=5  385/10=38,5=38   38/10=38=3

        for (int i = num; i > 0; i = i / 10) {
            sonuc = sonuc + i % 10;
        }
        System.out.println(sonuc);

        //Examples4) Sıze verılen bır strıngı ters cevıren kodu yazınız
        //  kaba    abak olacak

        String str = "Kaba";

        String ters = "";         //Concaniation yapacaksanız "" kullanın

        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);

            ters = ters + c;// c yı tesı her seferınde eklemek ıcın koyuyoruz
        }
        System.out.println(ters);

//ıntervıev sorusu


    }

}
