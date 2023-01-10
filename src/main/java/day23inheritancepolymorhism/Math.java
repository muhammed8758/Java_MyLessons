package day23inheritancepolymorhism;

public class Math extends Courses {

    public void practise(){
        System.out.println("Solve Questions");

    }

    public Math(){
        super("x");//parente git demek courses a gidecek
        System.out.println("Constructer 1");

    }
    public Math(int a){
      this();// ayni classin icerisinde diger constracteri kullan demek
        System.out.println("Constructer 2");


    }

}
