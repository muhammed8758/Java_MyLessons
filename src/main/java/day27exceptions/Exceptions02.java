package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {
    /*
         1)FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt");
    "new" den sonraki "FileInputStream" hata verir. Cunku biz JAva ya verilen adresdeki dosyaya
    git dedik. Java iki endiseye kapildi.
    i) YA adres yanlis sa
    ii) Yada verilen adres de doya yoksa
    Biz method isminden sonra "throws FileNotFoundException" yazarak JAva ya bu iki endise duydugun
    durum olursa "exception at" dedik
        2) while((k=fis.read())!=-1){} yazdigimizda "read()" methodu hata verir. Cunku biz Java ya
        dosya daki karakterleri oku dedik. Java bir endiseye kapildi.
        i) Ya okumasi gereken karakterler Java nin bilmedigi karakterler ise
        Biz method isminden sonra "thows IOException" yazarak, Java ya bu durumla karsilastiginda
        "Exception At" dedik.
        3)Method isminden sonra "throws IOException" yazarsaniz Java" throws FileNotFoundException i siler
        Cunku "IOException" , "FileNotFoundException" i kapsar. "IOException" FileNotFoundException un parent idir.
        Onun yaptigi herseyi yapabilir. O yuzden "IOException" varken FileNotFoundException a gerek yoktur.

        IOException "input output Exception demektir.

        4) Gordugunuz gibi "IOException" ve "FileNotFoundException" biz kod yazarken ortaya cikti. Daha run buton una basmadan ortaya cikti.
        Bu tarz exception lara "Compile Time Exception" denir. Diger adlari "Checked Exception"dur

        5) "Compile Time Exception" lar kesinlikle halledilmelidir(Exception Handle). Halletmeden kod yazmaya devam edilmemelidir.

     */

    public static void main(String[] args) throws IOException {

        readTheFromTheFile();

        readTheText();

    }
    //Bir text file deki text i okuyan kodu yaziniz

    public static void readTheFromTheFile() throws IOException {

        FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt");

        int k = 0;
        while ((k = fis.read()) != -1) {
            System.out.print((char) k);
        }
    }

    public static void readTheText() {
        try {
            FileInputStream fis = new FileInputStream("src\\main\\java\\day27exceptions\\File1.txt");
            int k = 0;
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosyanin adresi veya Varligi ile ilgili bir problem var");

        } catch (IOException e) {
            System.out.println("Dosyada Okunamayan bir karakter var");
        }

    }
}