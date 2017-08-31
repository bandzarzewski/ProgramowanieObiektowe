package WzorzecObserwatorAmbulans;


// To jest obiekt który obserwuje inne obiekty(Policja,StrazPozarna,Pogotowie)

import java.util.ArrayList;

public class Operator1 implements IOperator {
    private ArrayList<ICentrumZgloszen> centrumZgloszenList;
    private String _noweZgloszenie;

    // Konstruktor
    Operator1() {
        centrumZgloszenList = new ArrayList<>();
    }


    @Override
    public void zarejstrujZgloszenie(ICentrumZgloszen zgloszenie) {
        centrumZgloszenList.add(zgloszenie);
    }

    @Override
    public void usunZgloszenie(ICentrumZgloszen zgloszenie) {
        centrumZgloszenList.remove(zgloszenie);
    }

    @Override
    public void wyslijInfOZgloszeniu() {
        for (ICentrumZgloszen centrumZg : centrumZgloszenList) {
            centrumZg.aktualizacja(_noweZgloszenie);
        }
    }

    public void setZgloszenie(String noweZgloszenie) {
        _noweZgloszenie = noweZgloszenie;
        wyslijInfOZgloszeniu();
    }

}

