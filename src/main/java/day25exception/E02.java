package day25exception;

public class E02 {
    public static void main(String[] args) {
        String arr[]={"ali","can","veli","Han"};

        getElementFromArray(arr,2);//veli
        getElementFromArray(arr,0);//ali
        getElementFromArray(arr,4);//

   }
    //Bir String Array den index girerek eleman elde edebilmek icin bir method olusturun
    public static void getElementFromArray(String arr[], int idx){

        try{
            System.out.println(arr[idx]);


        }catch(ArrayIndexOutOfBoundsException e){//Index 4 out of bounds for length 4
            System.out.println("hata"+e.getMessage());
            e.printStackTrace();// ayrintili hatayi gormek icin
            System.err.println("Hata var kardes");

        }
    }
}

