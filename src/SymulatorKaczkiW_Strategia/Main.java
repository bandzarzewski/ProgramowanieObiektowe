package SymulatorKaczkiW_Strategia;


public class Main {
    public static void main(String[] args) {
//        KaczkaPlaskonos kp = new KaczkaPlaskonos();
//        kp.print();
//        kp.kwacz();
//        KaczkaDzika kd = new KaczkaDzika();
//        kd.kwacz();
//        kd.lec();
        GumowaKaczka gk = new GumowaKaczka();
        gk.print();
        gk.wykonajKwakanie();
        gk.wykonajLatanie();
        KaczkaWabik kw = new KaczkaWabik();
        kw.print();
        kw.wykonajKwakanie();
        kw.wykonajLatanie();
        KaczkaModel km = new KaczkaModel();
        km.print();
        km.wykonajKwakanie();
        // km.wykonajLatanie();
        km.set_latanie(new NieLatam());
        km.wykonajLatanie();

    }
}
