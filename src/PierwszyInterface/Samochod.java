package PierwszyInterface;

/**
 * Created by RENT on 2017-08-23.
 */
public class Samochod implements ICzteroKolowy {

    @Override
    public void jedz() {
        System.out.println("Jedz na czolowek!\n");
    }

    @Override
    public void hamuj() {
        System.out.println("Jade \n");
    }

    @Override
    public void jedzNaCzolowke() {
        System.out.println("Hamuj! \n");
    }
}
