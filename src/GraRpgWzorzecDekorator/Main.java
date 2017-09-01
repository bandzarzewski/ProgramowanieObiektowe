package GraRpgWzorzecDekorator;


public class Main {
    public static void main(String[] args) {

        Bohater bohater = new Bohater();
        Tarcza t3 = new Kolce(new TarczaLateksowa());
        bohater.setImie("Czarny rycerz");
        System.out.println(bohater.getImie());

        System.out.printf("%s %s : obrona : %s", bohater.getImie(), t3.pobierzOpis(), t3.obrona());
        System.out.println();

        Kolce kolce = new Kolce(t3);
        System.out.printf("Nazwa:  %s  :: Obrona : %d", kolce.pobierzOpis(), kolce.obrona());

        System.out.println();
        Miecz m1 = new MieczLaserowy();
        System.out.println(m1.pobierzOpis());
        System.out.println();
        System.out.printf("%s %s : obrona : %s : plus %s:%s", bohater.getImie(), t3.pobierzOpis(), t3.obrona(),
                m1.pobierzOpis(), m1.obrona());


    }
}
