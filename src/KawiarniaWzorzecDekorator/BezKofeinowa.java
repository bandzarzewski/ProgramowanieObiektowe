package KawiarniaWzorzecDekorator;

/**
 * Created by RENT on 2017-08-30.
 */
public class BezKofeinowa extends Napoj {

    public BezKofeinowa() {
        opis = "BezKoffeinowa";
    }

    @Override
    public double koszt() {
        return 1.05;
    }
}
