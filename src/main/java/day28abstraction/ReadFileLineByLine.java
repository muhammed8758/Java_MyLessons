package day28abstraction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;// satir satir okutma teknigi
import java.io.IOException;
    /*
        "throw" ile "throws" arasindaki farklar nelerdir.// INTERVIEV SORUSU
        1) "throw" methodun body si icerisinde kullanilir. "throws" ise methodun isminden sonra kullanilir.
        2) "throw" dan sonra Object olusturulur. "throws" dan sonra ise sadece exceptions class in ismi yazilir
        3) "throw" methodun icinde istedigimiz yerde exception stmak icin kullanilir
           "throws" ise var olan checked Exception uretmek icin kullanir.
        4) "throw" dan sonra sadece 1 tane exception olabilir.
            "throws" dan sonra birden fazla exception olabilir.

    */


public class ReadFileLineByLine {
    public static void main(String[] args) {

        readFileLineByLine();
    }

    public static void readFileLineByLine() {
        try {

            BufferedReader br = new BufferedReader(new FileReader("C:src/main/java/day27exceptions/File1.txt"));

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Ya path yanlis ya da dosya silinmis - " + e.getMessage());

        } catch (IOException e) {
            System.out.println("Okunamayacak character veya characterler var - " + e.getMessage());
        }

    }
}