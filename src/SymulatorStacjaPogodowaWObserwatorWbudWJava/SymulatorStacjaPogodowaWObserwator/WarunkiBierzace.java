package SymulatorStacjaPogodowaWObserwator;

public class WarunkiBierzace implements IWyswietl, IObserwator {
    private float _temp;
    private float _wilgotnosc;
    private float _pressure;
    private IPodmiot _danePogodowe;

    public WarunkiBierzace(IPodmiot danePogodowe) {
        _danePogodowe = danePogodowe;
        _danePogodowe.zarejstrujObiekt(this); // this to wskaznik na samego siebie.
    }

    @Override
    public void wyswietl() {
        System.out.printf("Aktualne dane: %f stC, %f hPA, %f%%", _temp, _pressure, _wilgotnosc);

    }

    @Override
    public void aktualizacja(float temp, float pressure, float wilgotnosc) {
        _temp = temp;
        _wilgotnosc = wilgotnosc;
        _pressure = pressure;
        wyswietl();
    }
}
