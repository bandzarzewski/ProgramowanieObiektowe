package Pow0109.zad3Adapter;

public class AdapterIKapsulkiBosh implements IKapsulkaTassimo {

    private IKapsulkaBosh _kapsulkiBosh;

    AdapterIKapsulkiBosh(IKapsulkaBosh kapsulkaBosh) {
        this._kapsulkiBosh = kapsulkaBosh;
    }

    @Override
    public void ZrobKaweZKapsulkiTassimo() {
        _kapsulkiBosh.ZrobKaweZKapsulkiBosh();
        System.out.println("w ekspresie Bosh z kapsulki Tassimo");
    }
}
