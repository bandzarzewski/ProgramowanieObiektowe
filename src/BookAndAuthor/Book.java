package BookAndAuthor;

/**
 * Created by RENT on 2017-08-21.
 */
public class Book {
    private String _name;
    private Author _author; // To jest agregacja
    private double _price;
    private int _qty = 0; // stan magazynowy

    public Book(String _name, Author author, double _price) {
        this._name = _name;
        this._author = author;
        this._price = _price;
    }

    public Book(String _name, Author _author, double _price, int qty) {
        this._name = _name;
        this._author = _author;
        this._price = _price;
        this._qty = qty;
    }

    public String getName() {
        return _name;
    }

    public Author getAuthor() {
        return _author;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        this._price = price;
    }

    public int getQty() {
        return _qty;
    }

    public void setQty(int qty) {
        this._qty = qty;
    }

    public String toString() {
        return String.format("Book[name=%s %s ,price=%f, qty=%d]", _name, _author.toString(), _price, _qty);
    }
}
