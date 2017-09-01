package AmbulansWzorzecObserwator;

// Obiekt który obserwuje

public class FireBrigade implements IAmbulance {

    private IOperator _numberTask;

    public FireBrigade(IOperator numberTask) {
        this._numberTask = numberTask;
    }

    @Override
    public void upDate(String numberTask) {
        System.out.printf("New task %s \n", numberTask);
    }

    public void resignationFromNumberTask() {
        _numberTask.removeObserver(this);
    }

    public void driveToIncident() {
        System.out.printf("I go to %s", _numberTask);
    }

}
