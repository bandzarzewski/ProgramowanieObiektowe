package Adapter;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-08-31.
 */
public class Main {
    public static void main(String[] args) {
        DzikaKaczka kaczka = new DzikaKaczka();
        DzikiIndyk indyk = new DzikiIndyk();

        IndykAdapter ia = new IndykAdapter(indyk);
        KaczkaAdapter ka = new KaczkaAdapter(kaczka);

        ArrayList<IKaczka> ptaki = new ArrayList<>();
        ptaki.add(kaczka);
        ptaki.add(ia);

        ArrayList<IIndyk> ptaki2 = new ArrayList<>();
        ptaki2.add(ka);
        ptaki2.add(indyk);


        // uruchomKwakanieIGeganie(ptaki);
        uruchomKwakanieIGeganieDlaIndyka(ptaki2);


    }

    public static void uruchomKwakanieIGeganieDlaIndyka(ArrayList<IIndyk> ptaki2) {
        for (IIndyk indyk : ptaki2) {
            indyk.gulgocze();
            indyk.lataj();
        }

    }

    public static void uruchomKwakanieIGeganie(ArrayList<IKaczka> ptaki) {
        for (IKaczka kaczka : ptaki) {
            kaczka.kwacz();
            kaczka.lataj();
        }

    }
}
