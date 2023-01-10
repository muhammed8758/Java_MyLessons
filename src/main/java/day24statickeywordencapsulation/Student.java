package day24statickeywordencapsulation;
// Encapsulation: "Data Hiding(gizlemek)" demektir
//Data yi nicin gizlersiniz? Data yi dis etkilerden korumak icin
//Data yi nasil gizlersin? Acces Modifierini Private yaparak gizlerim
// Data yi gizledikten sonra baska Class lardan okumak istersen ne yapasrsin?
// "get" methodlar(getter) olusturarak gizledigimiz data lari okunur hale getirebiliriz
// Data yi gizledikten sonra baska Class lardan degistirmek istersen ne yapasrsin?
// "set" methodlar(setter) olusturarak gizledigimiz data lari degistirebiliriz
//variablenin data type ne ile get methodun return type ayni olmalidir
//get methodlari isimlendirirken get+variablename Ancak variablenin data type noolean ise is olur

public class Student {
    public String stdName="Tom Hanks";
    private String stdID="TH202201";
    private double gpa = 3.8;  //gpa ortalama
    private boolean retired = false;

    public String getStdID() {
        return stdID;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {// boolean larda get yerine is gelir
        return retired;
    }

    public void setStdID(String stdID) {
        this.stdID = stdID;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }

}
