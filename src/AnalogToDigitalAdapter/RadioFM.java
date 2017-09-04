package AnalogToDigitalAdapter;

import java.util.Random;


public class RadioFM implements IAnalogSignal {

    // 1.Generujemy tablice(random) z zakresu 0:2;
    // 2.przy pomocy if wybieramy tylko wartosci powyżej 1.
    // 3.Zamieniami to na bajty tzn.


    public RadioFM(double[] analogSignal) {
        this._analogSignal = analogSignal;
    }

    Random random = new Random();
    private double[] _analogSignal = random.doubles(8, 0.0, 2.0).toArray();


    @Override
    public double[] getAnalog() {
        return _analogSignal;
    }

    @Override
    public void setAnalog(double[] analogSignal) {
        this._analogSignal = analogSignal;
    }

    @Override
    public void printAnalog() {

        for (Double aSignal : _analogSignal) {
            System.out.printf("%f", aSignal);
        }


    }
}
