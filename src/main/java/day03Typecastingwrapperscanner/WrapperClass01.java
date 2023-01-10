package day03Typecastingwrapperscanner;

import javax.print.attribute.IntegerSyntax;

public class WrapperClass01 {
    public static void main(String[] args) {

        /*
        Java methodlara methodlar ekleyerek yeni bir structer olurşturdu Buna Wrapper Class denir.
        // Primitive+Method ==> Wrapper Class

            Primitive               Wrapper
            byte         ==>        Byte
            short        ==>        Short
            **int        ==>        Integer
            long         ==>        Long
            float        ==>        Float
            boolean      ==>        Bloolean
            **char       ==>        Character

         */

        byte primitiveByte =12;  //primitiveByte yazıp nokta koyduğunda method göremessin değer görürsün

        Byte wrapperByte = 12;  //wrapperByte yazıp nokta koyduğunuzda birçok method görürsünüz. çünkü "wrapper"lar method içerir.

        //  Example 1)byte data type nin en küçük ve en büyük değerlerini ekrana yazdırın.


        Byte b1 =13;
        System.out.println(Byte.MIN_VALUE);//-128
        System.out.println(Byte.MAX_VALUE);//127

        //  Example 2) short, int, long data type lerinin en büyük en küçük değerlerini yazdırın

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        // primitive ler nasıl Wrapperlara çevrilir.
        float f1=13.99F;
        Float wrapperf1=f1; //Autoboxing denir

        // wrapperlar primitivelere nasıl çevirilir
        Character w1='s';
        char primitivew=w1;  //Unboxing denir.

        //Note: Autuboxing ve Unboxing Java tarafından otomatik olarak yapılır.




    }

}
