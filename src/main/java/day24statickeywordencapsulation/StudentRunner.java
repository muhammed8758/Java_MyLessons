package day24statickeywordencapsulation;

public class StudentRunner {
    public static void main(String[] args) {
        Student std1 = new Student();

        System.out.println(std1.getStdID());//TH202201

        System.out.println(std1.getGpa());//3.8
        
        std1.setStdID("AB");
        System.out.println(std1.getStdID());// AB

        std1.setGpa(4.8);
        System.out.println(std1.getGpa());//4.8

        Student std2 = new Student();

        System.out.println(std2.getStdID());//TH202201








    }
}
