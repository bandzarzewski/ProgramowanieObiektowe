package SymulatorStacjaPogodowaWObserwatorWbudWJava.SymulatorStacjaPogodowaWObserwator;

/**
 * Created by RENT on 2017-08-29.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        DanePogodowe danePogodowe = new DanePogodowe();
        WarunkiBierzace warunkiBierzace = new WarunkiBierzace(danePogodowe);
        danePogodowe.ustawZmienne(11, 1030, 45);
        System.out.println();
        Thread.sleep(5000); // Zegar opoznienie
        danePogodowe.ustawZmienne(15, 1015, 50);
    }
}
