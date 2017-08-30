package SymulatorStacjaPogodowaWObserwator;

/**
 * Created by RENT on 2017-08-29.
 */
public interface IPodmiot {

    void zarejstrujObiekt(IObserwator obserwator);

    void usunObserwatora(IObserwator obserwator);

    void powiadomObserwatorow();

}
