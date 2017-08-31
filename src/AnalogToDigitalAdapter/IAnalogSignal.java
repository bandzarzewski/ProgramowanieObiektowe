package AnalogToDigitalAdapter;


public interface IAnalogSignal {
    double[] getAnalog(); // to jest tablicy zapiszemy wartosci wylosowane przez Random

    void setAnalog(double[] analogData);

    void printAnalog();

}
