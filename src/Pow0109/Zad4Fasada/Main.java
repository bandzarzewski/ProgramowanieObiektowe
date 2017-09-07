package Pow0109.Zad4Fasada;


public class Main {
    public static void main(String[] args) {
        Ziola ziola = new Ziola();
        Cukier cukier = new Cukier();
        TalkDlaDzieci talk = new TalkDlaDzieci();

        FasadaZiola fk = new FasadaZiola(cukier, talk, ziola);
        fk.zrobZiola();
    }
}
