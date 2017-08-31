package Fasada;


public class Main {
    public static void main(String[] args) {
        Telewizor telewizor = new Telewizor();
        Wzmacniacz wzmacniacz = new Wzmacniacz();
        TermoMix termoMix = new TermoMix();


        FasadaKinaDomowego fkd = new FasadaKinaDomowego(telewizor, termoMix, wzmacniacz);
        fkd.wrocDoDomu();
        System.out.println("--------");
        fkd.wyjdzZDomu();
    }
}
