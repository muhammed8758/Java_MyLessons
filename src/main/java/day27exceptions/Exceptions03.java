package day27exceptions;

public class Exceptions03 {
    /*
    1) Java Exception lar olusturarak Developer larin Java kurallarina uymalarini temin etmistir.
    2) Biz de Application uretirken kendi exceptionlarimizi olusturarak diger developlarin bizim
    ortaya koydugumuz kurllara uymalarini temin ederiz
    3) Java nin degil Bizim urettigimiz exceptionlara "Custom Exception" denir. //Interviev
    4) Custom Exception larda Runtime Exception ve Compile Time Exception olabilir
    5) Custom "RunTime Exception" uretmek icin "extends RunTimeException" denir
    6) Custom "CompileTime Exception" uretmek icin "extends Exception" denir
     */
    public static void main(String[] args) throws IllegalGradeException {
        printGrade(100);

        checkNameFormat("ali");


    }
    //Ogrenci Notlarini yazdiran bir method olusturunuz
    public static void printGrade(double grade) throws IllegalGradeException {
        if(grade<0 || grade>100){
            throw new IllegalGradeException ("Grade 0 dan az 100 den cok olamz");
        }else{
            System.out.println(grade);
        }
    }
    //Verilen ismin ilk harfinin buyuk harf olmamasi durumunda exception atan method yaziniz
    public static boolean checkNameFormat(String name){
        if(name.charAt(0)>= 'A' && name.charAt(0)<='Z'){
            return true;
        }else{
            throw new IllegalNameException("isimler buyuk harfle baslamalidir");
        }
    }
}
