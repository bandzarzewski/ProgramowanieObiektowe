package Pow0709.Zad1;

public class ZliczanieLiter {

    public void countLetters(String text, char letter) {

        text = text.toLowerCase();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == letter) {
                count++;
            }
        }
        System.out.printf("Znak: %s ,wystepuje %d razy ", letter, count);

    }


}



