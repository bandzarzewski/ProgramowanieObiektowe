package Adapter;


public class IndykAdapter implements IKaczka {

    private IIndyk _indyk;

    IndykAdapter(IIndyk indyk) { // przekazujemy juz instniejacego indyka
        _indyk = indyk;
    }

    @Override
    public void kwacz() {
        _indyk.gulgocze(); // musimy pozamieniac metody
    }

    @Override
    public void lataj() {
        _indyk.lataj();
    }
}
