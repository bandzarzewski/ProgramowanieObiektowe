package WzorzecObserwatorAmbulans;


public class Main {
    public static void main(String[] args) {
        Operator1 operator1 = new Operator1();
        Pogotowie pogotowie = new Pogotowie(operator1);
        operator1.setZgloszenie("A123");
        pogotowie.aktualizacja("A123");


    }
}
