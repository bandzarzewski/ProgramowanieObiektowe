package Pow0709.Zad1;

public class ZliczanieLiter {
    public static void main(String[] args) {
        String zdanie = "Ten samochod ma cztery kola";
        zdanie = zdanie.toLowerCase();
        System.out.println(zdanie);
        char znak = 'b';
        int counter = 0;
        for (int i = 0; i < zdanie.length(); i++) {
            if (zdanie.charAt(i) == znak) {
                counter++;
            }
            System.out.printf("Znak " + znak + " nie występuje w podanym Stringu ");
            break;
        }
        System.out.println();
        System.out.printf("Znak: %s wystepuje %d", znak, counter);
    }
}
