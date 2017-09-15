package Pow0709.Zad1;

import org.junit.Assert;
import org.junit.Test;


// Nie działa test, prawdopobnie trzeba dopisać metode która bedzie drukować wynik

public class Testy_ZLiczanieLiter {
    ZliczanieLiter zliczanieLiter = new ZliczanieLiter();

    @Test
    public void ZliczanieLiterTest() {
        zliczanieLiter.countLetters("Ala ma kota", 'a');
        Assert.assertEquals("Znak: a ,wystepuje 4 razy ", zliczanieLiter);
    }


}
