package day28abstraction;

public class Accord implements Engine,Ac,Hood{
    @Override
    public void eco() {
        System.out.println("uses eco engine");
    }

    @Override
    public void gas() {
        System.out.println("uses gas");
    }

    @Override
    public void tsi() {
        System.out.println("uses tsi tecnology");
    }

    @Override
    public void digital() {
        System.out.println("digital");

    }

    @Override
    public void cilimate() {
        System.out.println("climate");

    }

    @Override
    public void steel() {
        System.out.println("Hood is made by steel");
    }
}
