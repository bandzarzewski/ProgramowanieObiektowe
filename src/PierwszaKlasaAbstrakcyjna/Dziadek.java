package PierwszaKlasaAbstrakcyjna;

/**
 * Created by RENT on 2017-08-23.
 */
public class Dziadek extends Emeryt {
    @Override
    public void krzyczNaDzieci() {
        System.out.println(" Masz 10zł  ");
    }

    @Override
    public void walczOMijesceWAutobusie() {
        System.out.println(" Laską po głowie");
    }

    @Override
    public void biegnijDoSklepu(int odleglosc, int predkosc) {
        super.biegnijDoSklepu(odleglosc, predkosc);
    }

    public void zapalSzluga() {
        System.out.println("Pali szluga");
    }

    @Override
    public void zjedzSzalotka() {
        System.out.println("Niezlo szarlotke");
    }
}
