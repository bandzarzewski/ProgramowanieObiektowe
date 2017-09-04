package AnalogToDigitalAdapter;

public class AnalogToDigitalAdapter implements IDigitalSignal {

    IAnalogSignal _analogSignal;

    public AnalogToDigitalAdapter(IAnalogSignal analogSignal) {
        this._analogSignal = analogSignal;
    }

    @Override
    public int[] getDigit() {
        return new int[0];
    }

    @Override
    public void setDigit(int[] digitData) {

    }

    @Override
    public void printDigit() {

    }
}
