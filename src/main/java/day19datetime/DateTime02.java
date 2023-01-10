package day19datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {

        //Examples01) Java dan aldiginiz date i "ay/gun/yil" olarak yaziniz

        LocalDate currentDate =  LocalDate.now();

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("MM/dd/yyyy");// tarih formatini degistirme
        String formattedDate1=dtf1.format(currentDate);
        System.out.println(formattedDate1);//10/21/2022

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formattedDate2=dtf2.format(currentDate);
        System.out.println(formattedDate2);//Eki/21/2022

        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formattedDate3=dtf3.format(currentDate);
        System.out.println(formattedDate3);//Ekim/21/2022

        DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("M/dd/yyyy");
        String formattedDate4=dtf4.format(currentDate);
        System.out.println(formattedDate4);//9/21/2022

        DateTimeFormatter dtf5=DateTimeFormatter.ofPattern("MM/dd/yy");
        String formattedDate5=dtf5.format(currentDate);
        System.out.println(formattedDate5);//10/21/22

        DateTimeFormatter dtf6=DateTimeFormatter.ofPattern("MM/d/yy");
        String formattedDate6=dtf6.format(currentDate);
        System.out.println(formattedDate6);//10/9/22


        //Examples02) Java dan aldiginiz Time in formatini degisirniz

        LocalTime myTime=LocalTime.of(16,23,54,23456);
        System.out.println("myTime = " + myTime);//myTime = 16:23:54.000023456

        DateTimeFormatter dtf7=DateTimeFormatter.ofPattern("hh:mm a");
        String FormattedMyTime=dtf7.format(myTime);
        System.out.println("FormattedMyTime = " + FormattedMyTime);//FormattedMyTime = 04:23

        DateTimeFormatter dtf8=DateTimeFormatter.ofPattern("HH:mm");
        String FormattedMyTime8=dtf8.format(myTime);
        System.out.println("FormattedMyTime = " + FormattedMyTime8);




    }
}
