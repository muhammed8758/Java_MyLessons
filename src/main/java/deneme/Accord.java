package deneme;

public class Accord implements Engine,Ac,Hood {
    @Override
    public void eco() {

    }

    @Override
    public void gas() {

    }

    @Override
    public void tsi() {

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
