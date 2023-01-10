package deneme;

import org.w3c.dom.ls.LSOutput;

public class Civic implements Engine, Ac, Hood{
    @Override
    public void eco() {

    }

    @Override
    public void gas() {

    }

    @Override
    public void tsi() {
        System.out.println("uses tsi");

    }

    @Override
    public void digital() {
        System.out.println("uses digital");

    }

    @Override
    public void climate() {
        System.out.println("uses climate");

    }

    @Override
    public void steel() {
        System.out.println("uses steel");
    }
}
