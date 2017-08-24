package PierwszaKlasaAbstrakcyjna;

/**
 * Created by RENT on 2017-08-23.
 */
public class Main {
    public static void main(String[] args) {
        Emeryt.glupiaMetoda();// bez tworzenia obiketu dostajemy sie do klasy statycznej

        Emeryt bacia = new Bacia();
        Emeryt bacia2 = bacia;
        bacia2.zjedzSzalotka();


    }
}
