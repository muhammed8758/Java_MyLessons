package day13loopsarrays;

import javax.lang.model.type.ArrayType;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

public class Arrays01 {
    /*
    1)Ayni data tipinde coklu datayi depolamak icin Java nin olusturdugu yapilar vardir. Bu yapilardan birisi de Array lardir
    2)
     */
    public static void main(String[] args) {
        int stdAges[] =new int[7];//[0,0,0,0,0,0,0]
        System.out.println(Arrays.toString(stdAges));
        //Array lere elemanlar nasil eklenir?
        stdAges[0]=11;
        stdAges[1]=12;
        stdAges[2]=13;
        stdAges[3]=14;
        stdAges[4]=10;
        stdAges[5]=12;
        stdAges[6]=12;
        System.out.println(Arrays.toString(stdAges));

        // Array deki herhangi bir elemani nasil yazdirabiliriz
        System.out.println(stdAges[4]);//10

        //Examples1) Array deki en buyuk ve en kucuk elemani yazdirin

        Arrays.sort(stdAges);// kucukden buyuge doru dizer
        System.out.println(Arrays.toString(stdAges));
        int ilk=stdAges[0];
        //note: length() String lere kullanilir "length" arraylerde kullanilir
        int son= stdAges[stdAges.length-1];
        System.out.println(ilk+son);

        //Examples2) stdAges Array i icindeki tum elemanlarin toplamini ekrana yazdiran kodu yazdirin

        //1.yol
//        int sum=0;

//        for(int i=0; i< stdAges.length; i++){
//            sum=sum+stdAges[i];
//
//        }
//        System.out.println(sum);
//
        //2.yol

//        int i=0;
//        int toplam=0;
//        while(i<stdAges.length){
//            toplam=toplam+stdAges[i];
//            i++;
//        }
//        System.out.println(toplam);

        //3.yol
//        int k=0;
//        int s=0;
//
//        do{
//            s=s+stdAges[k];
//            k++;
//
//        }while(k<stdAges.length);
//        System.out.println(s);

        //4.yol  for each loop en gelismis loop dur. Mumkuse bunu kullanin. sadece Arraylerde ve Collections larda kulanilir

        int t=0;

        for(int w :stdAges){
            t=t+w;

        }
        System.out.println(t);

        //Examples3) String bir array olusturunuz
        //           Bu Array e 5 tane isim yerlestiriniz
        //           Bu isimlerdeki kararkter sayilarinin toplamini ekrana yazdiriniz

        String name[] =new String[5];

        name[0]="Ali";
        name[1]="Veli";
        name[2]="Cin";
        name[3]="Elif";
        name[4]="Ayse";

        int karakterSayilariSum=0;

        for(String w : name){
            karakterSayilariSum = karakterSayilariSum + w.length();
        }
        System.out.println(karakterSayilariSum);


        //Examples4) char bir array olusturunuz
        // bu array a 5 eleman ekleyiniz
        // sonra da bu array deki buyuk harflere yazdiriniz

        char  ch[]={'A','c','D','k','M'};// kisa yolu arraya eleman eklemenin yolu
        for(char w : ch){
            if(w>='A'&& w<='Z'){
                System.out.println(w);

            }
        }

    }
}