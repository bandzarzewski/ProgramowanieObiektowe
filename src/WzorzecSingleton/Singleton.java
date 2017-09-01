package WzorzecSingleton;


public class Singleton {
    // 1. Tworzymy prywatna statyczne pole reprezentujacego instacje singletona
    private static Singleton _instancja;

    // 2. Prywatny Konstruktor
    private Singleton() {
    }

    // 3. Statyczna metoda zwracajaca instacje singletona, a jak nie istnieje to ja tworzy
    public static synchronized Singleton getInstance() {
        if (_instancja == null) {
            _instancja = new Singleton();
        }
        return _instancja;
    }

}
