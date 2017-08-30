package SymulatorStacjaPogodowaWObserwatorWbudWJava.SymulatorStacjaPogodowaWObserwator;

import java.util.Observable;


public class DanePogodowe extends Observable {

    // deklaracja zmiennych obiektowych

    private float _temp;
    private float _wilgotnosc;
    private float _pressure;

    // konstruktor
    public DanePogodowe() {
    }

    public void odczytyZmiana() {
        // to sa metody wbudowane w Jav
        setChanged();
        notifyObservers();
    }

    public void ustawZmienne(float temp, float wilgotnosc, float pressure) {

        _temp = temp;
        _wilgotnosc = wilgotnosc;
        _pressure = pressure;
        odczytyZmiana();
    }

    public float getTemp() {
        return _temp;
    }

    public float getWilgotnosc() {
        return _wilgotnosc;
    }

    public float getPressure() {
        return _pressure;
    }
}
