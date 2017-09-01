package GraRpgWzorzecDekorator;


public class MieczLaserowy extends Miecz {

    public MieczLaserowy() {
        opis = " Miecz Laserowy";
    }

    @Override
    public int obrona() {
        return 45;
    }
}
