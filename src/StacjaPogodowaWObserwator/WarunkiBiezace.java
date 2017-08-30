package StacjaPogodowaWObserwator;

public class WarunkiBiezace implements IWyswietl, IObserwator {
    private float _temp;
    private float _cisnienie;
    private float _wilgotnosc;
    private IPodmiot _danePogodowe;

    WarunkiBiezace(IPodmiot danePogodowe) {
        _danePogodowe = danePogodowe;
        _danePogodowe.zarejestrujObserwatora(this);
    }

    @Override
    public void wyswietl() {
        System.out.printf("Aktualne dane: %f stC, %f hPA, %f %%\n",
                _temp, _cisnienie, _wilgotnosc);
    }

    @Override
    public void aktualizuj(float temp, float cisnienie, float wilgotnosc) {
        this._temp = temp;
        this._cisnienie = cisnienie;
        this._wilgotnosc = wilgotnosc;
        wyswietl();
    }
}
