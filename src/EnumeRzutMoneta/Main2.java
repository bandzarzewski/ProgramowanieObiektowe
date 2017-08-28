package EnumeRzutMoneta;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Maciek on 28.08.2017.
 */
public class Main2 {
    // public enum Coin {HEADS, TAILS}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadz 0 dla Heads lub 1 dla Tails");


        int userGuess = sc.nextInt();
        sc.close();
        System.out.println("Rzut monetą ");
        int coinSide = new Random().nextInt(2);

        if (coinSide == userGuess) {
            System.out.println("Dobra robota, trafiłeś !");
        } else if (coinSide == 0) {
            System.out.println(" Przepraszam to jest Heads");
        } else {
            System.out.println("Przepraszam to jest Tails");
        }
    }
}
