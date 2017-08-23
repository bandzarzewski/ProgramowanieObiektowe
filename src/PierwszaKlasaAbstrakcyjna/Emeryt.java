package PierwszaKlasaAbstrakcyjna;

/**
 * Created by RENT on 2017-08-23.
 */
public abstract class Emeryt implements ISzalotka {
    public static final int ILOSC_OCZU = 2;

    public abstract void krzyczNaDzieci();

    public abstract void walczOMijesceWAutobusie();

    //zwykła metoda z implementacją
    public void biegnijDoSklepu(int odleglosc, int predkosc) {

        double czas = (double) odleglosc / predkosc;
        System.out.println("Biegne po kiełbase bede za " + czas);
    }

    public static void glupiaMetoda() {
    }

    public void zjedzSzalotka() {
        System.out.println(" Zwykle ciatko ");
    }

}
