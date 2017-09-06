package Wyjatki;

public class Calculator {
    public static void main(String[] args) {

        int sum = 0;
        int temp = 0;
        for (String s : args) {
            try {
                temp = Integer.parseInt(s);
            } catch (IllegalArgumentException e) {
                System.out.println("Znak " + s + " nie jest liczba");
                temp = 0;
            }
            sum += temp;
        }
        System.out.println(sum);
    }
}
