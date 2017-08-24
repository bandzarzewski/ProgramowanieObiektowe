package PierwszyInterface;

/**
 * Created by RENT on 2017-08-23.
 */
public class Rower implements IDwuKolowy {
    @Override
    public void jedz() {
        System.out.println(" Uwaga jade");
    }

    @Override
    public void hamuj() {
        System.out.printf(" Hamuje ");
    }

    @Override
    public void przewrocSie() {
        System.out.println("Przwracam sie ");
    }
}
