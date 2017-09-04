import java.util.Random;

public class KlasaMainTestowa {
    public static void main(String[] args) {


        Random random = new Random();
        double[] analogSignal = random.doubles(8, 0.0, 2.0).toArray();
        for (int i = 0; i < analogSignal.length; i++) {
            if (analogSignal[i] > 1) {
                System.out.println(analogSignal[i]);
            }


        }
    }
}
