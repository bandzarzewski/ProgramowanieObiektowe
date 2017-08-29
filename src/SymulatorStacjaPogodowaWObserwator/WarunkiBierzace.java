package SymulatorStacjaPogodowa;

public class WarunkiBierzace implements IWyswietl, IObserwator {
    private float _temp;
    private float _wilgotnosc;
    private float _pressure;
    private IPodmiot DanePogodowe;

    public WarunkiBierzace(){
        DanePogodowe.zarejstrujObiekt(this);
    }

    @Override
    public void wyswietl() {
        System.out.printf("Aktualne dane: %f, stC, %f hTP, %f%%",_temp,_pressure,_wilgotnosc);

    }

    @Override
    public void aktualizacja(float temp, float pressure, float wilgotnosc) {
        _temp = temp;
        _wilgotnosc = wilgotnosc;
        _pressure = pressure;
        wyswietl();
    }
}
