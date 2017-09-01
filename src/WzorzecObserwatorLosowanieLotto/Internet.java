package WzorzecObserwatorLosowanieLotto;


public class Internet implements IObserwator, Media {
    private int[] wyniki;
    private Totolotek _lotek;

    Internet(Totolotek lotek) {
        wyniki = new int[6]; // tworzymy tablice 6 elementowa
        this._lotek = lotek;
    }


    @Override
    public void update(int[] tab) {
        for (int i = 0; i < 6; i++) {
            wyniki[i] = tab[i]; // tworzymy nowa tablice wyniki[]  danymi ktore dostaniemy z update
        }
    }

    // metoda z klasy Media
    @Override
    public void informuj() {
        System.out.println();
        System.out.println("Wyniki lotto w Internecie");

        for (int i : wyniki) {
            System.out.print(i + " ");
            // System.out.println();
        }

    }

    public void kasujObserwatora() {
        _lotek.usunObserwator(this);
    }
}
