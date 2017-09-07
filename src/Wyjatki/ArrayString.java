package Wyjatki;

public class ArrayString {
    public String findElement(String[] str, String element) throws ArrayStoreException {
        for (int i = 0; i < str.length; i++) {

            if (element.equals(str[1])) {
                return element;
            }
        }
        throw new ArrayStoreException("Mamy problem");
    }
}
