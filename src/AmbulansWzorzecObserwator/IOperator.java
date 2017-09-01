package AmbulansWzorzecObserwator;

public interface IOperator {

    void registerObserver(IAmbulance task);

    void removeObserver(IAmbulance task);

    void notifyObservers();

}
