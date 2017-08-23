package KoszykWSklepieInternetowym;

/**
 * Created by RENT on 2017-08-23.
 */
public abstract class Book implements IProduct {

    protected int _price;
    protected String _name;
    protected String _title;
    protected String _Autor;

    @Override
    public int getPrice() {
        return _price;
    }

    @Override
    public void setProductName(String name) {
        _name = name;

    }

    @Override
    public String getProductName() {
        return _name;
    }

    @Override
    public void setPrice(int price) {
        this._price = price;
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String title) {
        this._title = title;
    }

    public String getAutor() {
        return _Autor;
    }

    public void setAutor(String performer) {
        this._Autor = performer;
    }
}
