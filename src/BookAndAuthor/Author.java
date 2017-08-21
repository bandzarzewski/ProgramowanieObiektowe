package BookAndAuthor;

/**
 * Created by RENT on 2017-08-21.
 */
public class Author {
    private String _name;
    private String _email;
    private Character _gender;

    public Author(String name, String email, Character gender) {
        this._name = name;
        this._email = email;
        this._gender = gender;
    }

    public String getName() {
        return _name;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String _email) {
        this._email = _email;
    }

    public Character getGender() {
        return _gender;
    }

    public String toString() {
        return String.format("Author[name= %s,email=%s,gender=%c]", _name, _email, _gender);
    }
}
