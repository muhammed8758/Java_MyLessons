package day23zdevam;

public class Cat extends Mammal{
    public void meow() {
        System.out.println("Cats Meow");
    }

    // Asagidaki method "Overridding"
    @Override// @Override annotation ini kullanarak, Override islemini kontrol etmesini saglar
    public void eat() {// override yapmak  //super.eat() sil kendin ne istiyorsan onu yaz
        System.out.println("Cats Eat");

        /*
        1)Override yaparken medhodun body si degistirirlir
        2) Override yaparken asla method signature dokunulmaz(isim ve parametre degistirilemez)
        3) Override yaparken inheritance yapmak zorundasin
        4) Override yaparken Access Modifier'lar belli kurallara gore farklilastirilabilirler'
        5) Prive methodlar override yapilamazlar.
        6) Child Class daki override edilen methodun access modifire i PArent classdaki
        methodun access modifire ile ayni veya daha geni olmalidir

        note: Child Class daki method un Access Modfier daha dar olamaz
        7)Default methodlar ayni pacgage icindeyse override edilebilir Farkli package den override edilemezler
        8) Parent Class daki methodun return type void ise return type degistirilemez
        9) Parent Class daki methodun return type primitive ise return type degistirilemez
        10)Parent Class daki methodun return type WrapperClass ise return type degistirilemez
        11)Parent Class daki methodun return type Parent Class ise return type Childlardan biri olabilir
        Note: Child Class daki return type Parent Class dakinden genis olamaz
        Note: Aralarinda parent chil ilsikisi olmayan inheritance olmayan Class lar Override de return type degisiminde
         kullanilmazlar Mesala short int den kucuk fakat aralarinda parent child iliskisi olmadigindan int yerine short kullanamazsin
        Note: Child daki methodun Return type ndan parent daki return typena gidisde IS-A olmali
              Parent Class daki return type ndan Child daki return type a gitmeye HAS-A denir
        Note: Aralarinda IS-A relationship olan data type lara Covariant denir
        12) "final method" lar override edilemezler. final method body degistirilmesine izin vermez
        13) Polymorphism = Overloading + Overridding// coklu yapi
            Note : Polymorphism nedir derlerse Overloading  ve Overridding i anlatinzi
        14) Overloading ve Overloading arasindaki farklar
            i) Overloading icin inheritance gerekmez fakat Overriding icin gecerlidir
            ii)Private Methodlar Overload edilebilir. Fakat Override edilemezler
            iii) "final" methollar Overload edilebilir. Fakat Override edilemezler
            iv) Overloading Static polymorphism olarak, Overridding dynamic polymorphism olarak adlandirilir
                Cunku static methodlar Overload edilebilir, Override edilemzler


         */
    }

    @Override
    public int add(int a, int b, int c, int d) {
        return a+b+1;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b+1;
    }

    @Override
    public Animal create() {
        return new Animal();
    }


}
