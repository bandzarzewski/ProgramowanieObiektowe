package TypGeneryczny.ZadFruit;


public class Main {
    public static void main(String[] args) {

        Apple apple = new Apple();
        FruitBasket<Apple> fb = new FruitBasket<>();
        fb.setOwoc(apple);
        System.out.println(fb.getColor());


    }
}
