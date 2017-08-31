package WzorzecObserwatorAmbulans;

// Nadawca

public interface IOperator {

    void zarejstrujZgloszenie(ICentrumZgloszen zgloszenie);

    void usunZgloszenie(ICentrumZgloszen zgloszenie);

    void wyslijInfOZgloszeniu();

}
