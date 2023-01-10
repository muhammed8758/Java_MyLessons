package day11loops;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class deneme {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        readFileLineByLine();


    }

    public static void readFileLineByLine() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/java/day27exceptions/File1.txt"));

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("ya path yanlis ya da dosya silinmis" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ol=kunamayacak Charackterler" + e.getMessage());
        }
    }

}