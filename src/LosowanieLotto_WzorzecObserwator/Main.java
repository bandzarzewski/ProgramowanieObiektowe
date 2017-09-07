package LosowanieLotto_WzorzecObserwator;


public class Main {
    public static void main(String[] args) {

        Totolotek totolotek = new Totolotek();
        Internet internet = new Internet(totolotek);
        Telewizja telewizja = new Telewizja(totolotek);

        totolotek.dodajObserwator(internet);
        totolotek.dodajObserwator(telewizja);

        totolotek.kolejneLosowanie(); // tworzymy koleje losowanie
        telewizja.informuj();
        internet.informuj();
        telewizja.kasujObserwatora();
        internet.informuj();
    }
}
