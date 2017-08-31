package WydawcaISubW_Obserwator;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        KaczorDonald kd = new KaczorDonald();
        GazetaFakt gf = new GazetaFakt();

        Maciek mm = new Maciek(kd);

        kd.wydajNumer("KD: 1/2017");
        Thread.sleep(4000);
        kd.wydajNumer("KD: 3/2017");
        Thread.sleep(4000);

        mm.rezygnacjaZGazety();
        System.out.println("KD KD KD ");
        kd.wydajNumer("KD: 4/2017");
    }
}
