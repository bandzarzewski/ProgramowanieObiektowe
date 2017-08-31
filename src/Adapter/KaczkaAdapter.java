package Adapter;


public class KaczkaAdapter implements IIndyk {
    private IKaczka _kaczka;

    KaczkaAdapter(IKaczka kaczka) {
        this._kaczka = kaczka;
    }

    @Override
    public void gulgocze() {
        _kaczka.kwacz();
    }

    @Override
    public void lataj() {
        _kaczka.lataj();
    }
}
