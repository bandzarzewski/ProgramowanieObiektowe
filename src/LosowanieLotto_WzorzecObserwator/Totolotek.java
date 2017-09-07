package LosowanieLotto_WzorzecObserwator;

import java.util.ArrayList;

// obserwowany obiekt
public class Totolotek implements IObserwowany {
    private ArrayList<IObserwator> obserwatorzy;
    private int[] wyniki;

    Totolotek() {
        obserwatorzy = new ArrayList<>();
        wyniki = new int[]{0, 0, 0, 0, 0, 0};
    }

    @Override

    public void dodajObserwator(IObserwator obserwator) {
        obserwatorzy.add(obserwator);
    }

    @Override
    public void usunObserwator(IObserwator obserwator) {
        obserwatorzy.remove(obserwator);
    }

    @Override
    public void powiadomObserwujacych() {
        for (IObserwator ob : obserwatorzy) {
            ob.update(wyniki);
        }
    }

    // Losowanie kolejnych liczb
    public void kolejneLosowanie() {
        int i = 0;
        while (i < 6) {
            boolean powtorka = false;
            double x = (Math.random() * 47 - 10);// Math.random() generator liczb losowych
            for (int j = 0; j < 6; j++) {
                if (wyniki[j] == (int) x) {
                    powtorka = true;
                }
            }
            if (powtorka == false) {
                wyniki[i++] = (int) x;
            }

        }// while
        powiadomObserwujacych();
    }

    public int[] getWyniki() {
        return wyniki;
    }
}
