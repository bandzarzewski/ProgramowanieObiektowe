package PierwszyInterface;

/**
 * Created by RENT on 2017-08-23.
 */
public class Motocykl implements IDwuKolowy {
    @Override
    public void jedz() {
        System.out.println("Jade motocyklem ");
    }

    @Override
    public void hamuj() {
        System.out.println("Hamuje motocyklem");
    }

    @Override
    public void przewrocSie() {
        System.out.println("Lece z motocykla");
    }

    public void dodajGazu() {
        System.out.println("Dawaj po garach ");
    }
}
