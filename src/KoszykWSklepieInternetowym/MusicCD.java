package KoszykWSklepieInternetowym;

/**
 * Created by RENT on 2017-08-23.
 */
public abstract class MusicCD implements IProduct {
    protected int _price;
    protected String _name;
    protected String _title;
    protected String _performer;

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public void setProductName(String name) {
        _name = name;
    }

    @Override
    public String getProductName() {
        return null;
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

    public String getPerformer() {
        return _performer;
    }

    public void setPerformer(String performer) {
        this._performer = performer;
    }


}

