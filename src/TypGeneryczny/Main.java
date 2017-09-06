package TypGeneryczny;

public class Main {
    public static void main(String[] args) {
        Shirt shirt = new Shirt();
        GenerycznaWalizka<Shirt> walizka = new GenerycznaWalizka<>();
        walizka.setPrzedmiot(shirt);
        System.out.println(walizka.getThingName());
        System.out.println(walizka.getThingSize());

    }
}