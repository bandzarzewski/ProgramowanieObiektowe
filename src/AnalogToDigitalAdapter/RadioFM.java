package AnalogToDigitalAdapter;

import java.util.Random;

/**
 * Created by RENT on 2017-08-31.
 */
public class RadioFM implements IAnalogSignal {

    // 1.Generujemy tablice(random) z zakresu 0:2;
    // 2.przy pomocy if wybieramy tylko wartosci powyżej 1.
    // 3.Zamieniami to na bajty tzn.


    Random random = new Random();
    double[] analogSignal = random.doubles(8, 0.0, 2.0).toArray();

    // Mamy dostep do tablicy
    public RadioFM(double[] analogSignal) {
        this.analogSignal = analogSignal;
    }

    @Override
    public double[] getAnalog() {
        return new double[0];
    }

    @Override
    public void setAnalog(double[] analogData) {
    }

    @Override
    public void printAnalog() {

    }
}
