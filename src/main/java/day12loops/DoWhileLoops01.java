package day12loops;

public class DoWhileLoops01 {
    public static void main(String[] args) {
        int i=1;
        while(i<1){
            System.out.println("while loops");
            i++;
        }

        int k=1;
        do{
            System.out.println("do while loops");
            k++;
        }while(k<1);

        // do while loop kullandiginizda loop bady si iceriindeki kod en az bi kere calisir
        // yani do while loop icin zero execution mumkun degildir
        // yapar sonra sorgular

        //Example1) Bir ondalik sayinin ondalik kismidaki rakamlarinin toplamini bulunuz

        double num=24.365;
        String str=String.valueOf(num);// parantezin icinde koydugun herseyi String e cevirir
        System.out.println(str);

        //String.valueOf() methodu parantezin icine konulan data nin tipine String yapar

        //Regex icin nokta kulandiginizda onune "\\" koyunuz. Yani "\\." seklinde kullanilir
        String decimalPart=str.split("\\.")[1];
        System.out.println(decimalPart);//365

        int decimalInt=Integer.valueOf(decimalPart);//parantezi icin e koydugun seyi Integere cevir
        System.out.println(decimalInt);//365


        int sum=0;
        do{
            sum=sum+decimalInt%10;
            decimalInt=decimalInt/10;
        }while(decimalInt>0);
        System.out.println(sum);






    }
}
