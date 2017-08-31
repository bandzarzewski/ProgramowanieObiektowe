package GraRpgWzorzecDekorator;


public class Main {
    public static void main(String[] args) {

//

        //  System.out.printf(bohater.tarcza.pobierzOpis());  Bohater bohater = new Bohater();
//        // bohater.setImie("Adam");
//        System.out.println(bohater.getImie());


//        TarczaStalowa ts = new TarczaStalowa();
//        Kolce kolce = new Kolce(ts);
//        System.out.printf(" Nazwa:  %s  :: Obrona: %d", kolce.pobierzOpis(), kolce.obrona());

        Tarcza t1 = new TarczaLateksowa();
        Tarcza t2 = new TarczaRakietowa();

        System.out.println(t1.pobierzOpis() + " " + t1.obrona());
        System.out.println(t2.pobierzOpis() + " " + t2.obrona());
        System.out.println();
        t1 = new Kolce(t1);
        t2 = new PoleSiłowe(t2);
        System.out.println(t1.pobierzOpis() + " " + t1.obrona());
        System.out.println(t2.pobierzOpis() + " " + t2.obrona());
        System.out.println();
        Tarcza t3 = new Kolce(new TarczaLateksowa());
        Tarcza t4 = new PoleSiłowe(new TarczaRakietowa());
        System.out.println(t3.pobierzOpis() + " " + t3.obrona());
        System.out.println(t4.pobierzOpis() + " " + t4.obrona());


    }
}
