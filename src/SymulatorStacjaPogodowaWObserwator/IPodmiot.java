package SymulatorStacjaPogodowaWObserwator;


public interface IPodmiot {

    void zarejstrujObiekt(IObserwator obserwator);

    void usunObserwatora(IObserwator obserwator);

    void powiadomObserwatorow();

}
