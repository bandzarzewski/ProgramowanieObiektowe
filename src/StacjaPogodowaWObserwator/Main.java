package StacjaPogodowaWObserwator;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DanePogodowe dp = new DanePogodowe();
        WarunkiBiezace wb = new WarunkiBiezace(dp);

        dp.ustawZmienne(11,
                1030, 45);
        Thread.sleep(10000); // kolejny oddczyt bedzie za 10 sekund

        dp.ustawZmienne(13,
                1033, 50);

    }
}
