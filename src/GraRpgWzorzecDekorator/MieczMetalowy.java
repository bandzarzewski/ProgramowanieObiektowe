package GraRpgWzorzecDekorator;


public class MieczMetalowy extends Miecz {

    MieczMetalowy() {
        opis = "MieczMetalowy";
    }

    @Override
    public int obrona() {
        return 30;
    }
}
