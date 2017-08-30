package WzorzecDekoratorKawiarnia;


public class Main {
    public static void main(String[] args) {
        MocnoPalona mp = new MocnoPalona();
        Czekolada czekolada = new Czekolada(mp);
        System.out.printf("Nazwa: %s :: Cena: %.2f \n", czekolada.pobierzOpis(), czekolada.koszt());

        BezKofeinowa bezKofeinowa = new BezKofeinowa();
        Mleko mleko = new Mleko(bezKofeinowa);
        Czekolada czekolada1 = new Czekolada(mleko);
        System.out.printf("Nazwa: %s :: Cena: %.2f \n", czekolada1.pobierzOpis(), czekolada1.koszt());

        
    }
}
