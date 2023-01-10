package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays02 {

    public static void main(String[] args) {

        //MultiDimensionalArrays kisa yoldan nasil olusturulur

        char arr[][] = {{'a', 'b' }, {'C', 'D', 'E' }, {'?' }};//[[a, b], [C, D, E], [?]]

        System.out.println(Arrays.deepToString(arr));

        // Bir String MultiDimensionalArrays da icine "a" olan elemanlari consola yazdiriniz

        String brr[][] = {{"learn", "Java", "it"}, {"is", "easy"}};
        for (String[] w : brr) {// w = {"learn", "Java","it" }, {"is", "easy"}
            for (String k : w) {// k = "learn", "Java","it" "is", "easy"
                if (k.contains("a")) {
                    System.out.print(k + " ");
                }
            }
        }
    }
}