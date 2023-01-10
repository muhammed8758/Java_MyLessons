package day18arraylistspassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {
        //Examples1) Bir Integer array liste deki 7 haric tum elemanlari 2 arttiriniz

        List<Integer> ages = new ArrayList<>();

        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);

        for (Integer w : ages) {
            if (w == 7) {
                continue;
            }

            //w=w+2; ==> Listler bu sekilde update edilemezler
            ages.set(ages.indexOf(w), w + 2);

        }
        //System.out.println("ages = " + ages);

        //examples2) Size verilen ArrayList de 8(inclusive) ve 8den onceki tum elemanlari 2 katina cikariniz
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(7);
        nums.add(21);
        nums.add(8);
        nums.add(58);

        for (Integer w : nums) {
            nums.set(nums.indexOf(w),w*2);
            if (w == 8) {
                break;
            }
            System.out.println(nums);
            

        }
        
        
        
        
        
        
    }
}
