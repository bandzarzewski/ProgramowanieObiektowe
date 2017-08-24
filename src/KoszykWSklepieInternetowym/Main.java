package KoszykWSklepieInternetowym;

/**
 * Created by RENT on 2017-08-23.
 */
public class Main {
    public static void main(String[] args) {

        IProduct harrypotter = new HarryPotter();
        harrypotter.setPrice(24);
        harrypotter.setProductName("czesc 4");
        System.out.println(harrypotter.getPrice());
        System.out.println(harrypotter.getProductName());
    }
}
