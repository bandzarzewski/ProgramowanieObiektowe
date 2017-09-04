package AnalogToDigitalAdapter;

public class DigitalRadio implements IDigitalSignal {
    private int[] _digitalSignal;

    @Override
    public int[] getDigit() {
        return _digitalSignal;
    }

    @Override
    public void setDigit(int[] digitSygnal) {
        this._digitalSignal = digitSygnal;
    }

    @Override
    public void printDigit() {
        for (int dSignal : _digitalSignal) {
            System.out.printf("%d", dSignal);

        }

    }
}
