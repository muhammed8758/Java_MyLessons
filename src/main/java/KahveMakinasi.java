import java.sql.SQLOutput;
import java.util.Scanner;

public class KahveMakinasi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Kahve Cesitlerimiz"+"\n"+"1-Turk Kahvesi icin 1 "+"\n"+"2-Filtre Kahve icin 2 "+"\n"+"3-Expresso Kahve icin 3 ");
        String hangiKahve =scan.nextLine();
        switch(hangiKahve.toUpperCase()) {
            case "1":
                System.out.println("Turk Kahvesi Hazirlaniyor");
                break;
            case "2":
                System.out.println("Filtre Kahveniz Hazirlaniyor");
                break;
            case "3":
                System.out.println("Expresso Kahveniz Hazirlaniyor");
            default :
                System.out.println("Lutfen Gecerli Bir Secenek Giriniz");
        }
        System.out.println("Sut eklemek Ister Misiniz?" + "\n" + "Evet veya Hayir Olarak Cevaplayiniz");
        String milk=scan.next();

        if(milk.equalsIgnoreCase("evet")){
            System.out.println("Sut Ekleniyor");
        }else if(milk.equalsIgnoreCase("hayir")){
            System.out.println("Sut Eklenmiyor");
        }else{
            System.out.println("Gecerli Bir Secenek Giriniz");
        }

        System.out.println("Seker Ister Misiniz?");
        String seker=scan.next();
        if(seker.equalsIgnoreCase("evet")){
            System.out.println("Kac Seker");
            String bosKod = scan.nextLine();
            int kacSeker=scan.nextInt();
            System.out.println(kacSeker+"ekleniyor");

        } else if (seker.equalsIgnoreCase("hayir")) {
            System.out.println("Seker Eklenmiyor");
        }else{
            System.out.println("gecerli bir secenek giriniz");
        }
        System.out.println("Kahve Boyutunu Secer Misiniz?"+"\n"+
                            "Buyuk Boy"+"\n"+
                            "Orta Boy"+"\n"+
                            "Kucuk Boy"+"\n");

        String boyut=scan.nextLine();

        if(boyut.equalsIgnoreCase("buyuk boy")){
            System.out.println("Kahveniz buyuk boy hazırlanıyor.");
        }else if(boyut.equalsIgnoreCase("orta boy")){
            System.out.println("Kahveniz Orta Boy Hazirlaniyor");
        }else if(boyut.equalsIgnoreCase("kucuk boy")){
            System.out.println("Kahveniz Kucuk Boy Hazirlaniyor");
        }else{
            System.out.println("Gecerli Bir Secenek Giriniz");
        }

        System.out.println(hangiKahve+boyut+" hazirlaniyor");











    }
}
