package deneme;

public interface Engine {
   void eco();
   void gas();
   void tsi();

   public default int add(int a, int b){
      return a + b;
   }

static String update (String str){
      return str + "!";
}

}
