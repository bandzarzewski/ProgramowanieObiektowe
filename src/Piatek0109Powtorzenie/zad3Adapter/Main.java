package Piatek0109Powtorzenie.zad3Adapter;


public class Main {
    public static void main(String[] args) {
        EkspresBosh ekspresBosh = new EkspresBosh();
        EkspresTassimo ekspresTassimo = new EkspresTassimo();

        AdapterIKapsulkiBosh akb = new AdapterIKapsulkiBosh(ekspresBosh);
        AdapterIKapsulkiTassimo akt = new AdapterIKapsulkiTassimo(ekspresTassimo);

        //  ekspresTassimo.ZrobKaweZKapsulkiTassimo();

        akb.ZrobKaweZKapsulkiTassimo();
        akt.ZrobKaweZKapsulkiBosh();

    }
}
