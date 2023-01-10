package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {


        //Exaples01) Anlik Tarihi (current Date) ekrana yazdiran kodu yaziniz

        LocalDate currentDate = LocalDate.now(); // obj olusturma donusturme yaparak
        System.out.println("Current Date is " + currentDate);//2022-10-21

        //Exaples02) Anlik Zamani (current Time) ekrana yazdiran kodu yaziniz
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time is " + currentTime);//20:41:01.885933200

        //Exaples03) Anlik Tarihi (current Date) ve Anlik Zamani (current Time) ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date is " + currentDateTime);//2022-10-21T20:45:10.918193700

        //Examples04) Baska Ulkedeki Anlik Tarihi (current Date) ve Anlik Zamani (current Time) ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTimeJapan=LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("currentDateTimeJapan = " + currentDateTimeJapan);

        //Examples 5) Istanbul da kac
        LocalDateTime currentDateTimeIstanbul=LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println("currentDateTimeIstanbul = " + currentDateTimeIstanbul);

        //Examples 6) Bugunden 789 dun sonra emekli olacagina gore' emeklilik tarihini hesaplayan kodu yaziniz
//        LocalDate countDate=LocalDate.of(2022,18,21);
//        LocalDate retireDate=countDate.plusDays(789);// ekleme yapmak
//        System.out.println("retireDate = " + retireDate);

        //Examples7) iki cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz

        LocalDate dobAli=LocalDate.of(2005,5,17);
        LocalDate dobVeli=LocalDate.of(2013,5,18);

        //between (dobAli, dobVeli) methodu kullanildiginda daha eski olan tarih once yazilir
        Long different=ChronoUnit.DAYS.between(dobAli,dobVeli);
        System.out.println("different = " + different);


        
        
        //Examples9) istanbulun Fethi ile Cumhuriyetin Kurulmasi arasinda kac ay oldugunu gosteen kac ay oldugunu gosteren kodu yaziniz
        
        LocalDate istFethi= LocalDate.of(1453,05,29);
        LocalDate CumKurulus=LocalDate.of(1923,10,29);
        
        Long aySayisi=ChronoUnit.MONTHS.between(istFethi, CumKurulus);
        System.out.println("aySayisi = " + aySayisi);//5645

        //Examples10) Verilen tarihin Hangi burcta oldugunu gosteren kodu yaziniz

        LocalDate myDate=LocalDate.of(1987,05,19);

        int day= myDate.getDayOfMonth();
        int month = myDate.getMonthValue();

        //1.yol

        if(day>21 && month==3){
            System.out.println("Koc");
        }else if(day<20&&month==4){
            System.out.println("Koc");
        }else if(day<21&&month==4){
            System.out.println("Boga");
        }else if(day<20&&month==5){
            System.out.println("Boga");
        }else if(day<21&&month==5){
            System.out.println("Ikizler");
        }else if(day<20&&month==6){
            System.out.println("Ikizler");
        }

        //2.Yol
        if((day>21 && month==3) || (day<20&&month==4)){
            System.out.println("Koc");
        }else if((day>21 && month==4) || (day<20&&month==5)) {
            System.out.println("Boga");
        }



    }
}