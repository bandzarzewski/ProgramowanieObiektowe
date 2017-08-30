<<<<<<< HEAD
package SymulatorStacjaPogodowaWObserwatorWbudWJava.SymulatorStacjaPogodowaWObserwator;

import java.util.Observable;
import java.util.Observer;

public class WarunkiBierzace implements IWyswietl, Observer {
    private float _temp;
    private float _wilgotnosc;
    private float _pressure;
    private Observable _danePogodowe;

    public WarunkiBierzace(Observable danePogodowe) {
        _danePogodowe = danePogodowe;
        danePogodowe.addObserver(this);
    }

    @Override
    public void wyswietl() {
        System.out.printf("Aktualne dane: %f stC, %f hPA, %f%%", _temp, _pressure, _wilgotnosc);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof DanePogodowe) {
            _temp = ((DanePogodowe) o).getTemp();
            _pressure = ((DanePogodowe) o).getPressure();
            _wilgotnosc = ((DanePogodowe) o).getWilgotnosc();
            wyswietl();
        }
    }
}
=======
//package SymulatorStacjaPogodowaWObserwator;
//
//public class WarunkiBierzace implements IWyswietl, IObserwator {
//    private float _temp;
//    private float _wilgotnosc;
//    private float _pressure;
//    private IPodmiot _danePogodowe;
//
//    public WarunkiBierzace(IPodmiot danePogodowe) {
//        _danePogodowe = danePogodowe;
//        _danePogodowe.zarejstrujObiekt(this); // this to wskaznik na samego siebie.
//    }
//
//    @Override
//    public void wyswietl() {
//        System.out.printf("Aktualne dane: %f stC, %f hPA, %f%%", _temp, _pressure, _wilgotnosc);
//
//    }
//
//    @Override
//    public void aktualizacja(float temp, float pressure, float wilgotnosc) {
//        _temp = temp;
//        _wilgotnosc = wilgotnosc;
//        _pressure = pressure;
//        wyswietl();
//    }
//}
>>>>>>> 7b8f435cbd653183e9ff2a3ee0386b9766b7a5de
