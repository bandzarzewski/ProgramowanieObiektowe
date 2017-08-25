package Piatek2508Powtorzenie.Zad1;

/**
 * Created by RENT on 2017-08-25.
 */
public class Main {
    public static void main(String[] args) {
        MyTime myTime = new MyTime();
        myTime.setTime(25, 59, 59);
        myTime.nextSecond();
        System.out.println(myTime.toString());
        String tekst = "madasfgewkfs";
        String ostatniElemnt = tekst.substring(tekst.length() - 3);
        System.out.println(ostatniElemnt);

    }
}
