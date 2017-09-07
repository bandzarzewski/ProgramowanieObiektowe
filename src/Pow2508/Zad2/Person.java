package Pow2508.Zad2;

/**
 * Created by RENT on 2017-08-25.
 */
public class Person {
    private String _name;
    private String _surname;
    private String _PESEL;
    private char gender;
    private BirthDay birthDay;

    public Person(String name, String surname, String PESEL) {
        this._name = name;
        this._surname = surname;
        this._PESEL = PESEL;
    }

    public String getName() {
        return _name;
    }

    public String getSurname() {
        return _surname;
    }


}
