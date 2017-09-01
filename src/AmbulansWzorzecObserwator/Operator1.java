package AmbulansWzorzecObserwator;

import java.util.ArrayList;

public class Operator1 implements IOperator {
    private ArrayList<IAmbulance> iAmbulancesList;
    private String _numberTask;

    Operator1() {
        iAmbulancesList = new ArrayList<>();
    }

    @Override
    public void registerObserver(IAmbulance task) {
        iAmbulancesList.add(task);
    }

    @Override
    public void removeObserver(IAmbulance task) {
        iAmbulancesList.remove(task);
    }

    @Override
    public void notifyObservers() {
        for (IAmbulance ambulance : iAmbulancesList) {
            ambulance.upDate(_numberTask);
        }
    }

    public void setTask(String numberTask) {
        _numberTask = numberTask;
        notifyObservers();
    }
}

