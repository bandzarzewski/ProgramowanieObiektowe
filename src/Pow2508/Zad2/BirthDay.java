package Pow2508.Zad2;

import java.util.Calendar;

/**
 * Created by RENT on 2017-08-25.
 */
public class BirthDay {
    private Person _birthDay;
    // Aktualny czas
    Calendar calendar = Calendar.getInstance();

    public BirthDay(Person birthDay) {
        this._birthDay = birthDay;
    }

    public void setBirthDay(Person _birthDay) {
        this._birthDay = _birthDay;
    }

    public Person getBirthDay() {
        return _birthDay;
    }

    // Metoda zwroci liczbe dni, która żyje dana osoba
    // Aktualna data minus data urodzenia
//    public int dayOfLife() {
//        return;
//    }
}
