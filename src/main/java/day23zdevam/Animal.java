package day23zdevam;

public class Animal  {
    //Asagidaki method "Overridden" method
     public void eat(){
        System.out.println("Animals eat");
    }
    public int add(int a, int b, int c, int d) {
         return a+b;
    }
    public Integer multiply(int a,int b) {
         return a*b;
    }
    public Animal create() {
         return new Animal();
    }

}
