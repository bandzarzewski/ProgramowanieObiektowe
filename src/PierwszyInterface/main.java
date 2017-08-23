package PierwszyInterface;

/**
 * Created by RENT on 2017-08-23.
 */
public class main {
    public static void main(String[] args) {

        ICzteroKolowy samochod1 = new Samochod();
        samochod1.jedzNaCzolowke();

        Motocykl motocykl1 = new Motocykl();
        motocykl1.dodajGazu();
    }

}
