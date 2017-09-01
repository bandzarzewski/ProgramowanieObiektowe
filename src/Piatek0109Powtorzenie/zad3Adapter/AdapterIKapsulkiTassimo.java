package Piatek0109Powtorzenie.zad3Adapter;

public class AdapterIKapsulkiTassimo implements IKapsulkaBosh {

    private IKapsulkaTassimo _kapsulkiTassimo;

    AdapterIKapsulkiTassimo(IKapsulkaTassimo kapsulkaTassimo) {
        this._kapsulkiTassimo = kapsulkaTassimo;
    }

    @Override
    public void ZrobKaweZKapsulkiBosh() {
        _kapsulkiTassimo.ZrobKaweZKapsulkiTassimo();
        System.out.println("w ekspresie Tossimo z kapsulki Bosh");
    }
}
