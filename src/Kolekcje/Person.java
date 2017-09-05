package Kolekcje.Zad1;

public class Person {

    private String _name;
    private String _shoppingList;

    public Person(String name, String shoppingList) {
        this._name = name;
        this._shoppingList = shoppingList;
    }

    public String getName() {
        return _name;
    }

    public String unpackShopping() {
        return "Wypakowuje na tasme " + _shoppingList;

    }
}
