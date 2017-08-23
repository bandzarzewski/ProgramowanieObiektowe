package PolimorfizmShape;

/**
 * Created by RENT on 2017-08-22.
 */
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("yellow", true);
        System.out.println(shape);
        Circle circle = new Circle("green", true, 2.5);
        System.out.println(circle);
        Rectangle rectangle = new Rectangle("pink", false, 2.0, 5.0);
        System.out.println(rectangle);
        Square square = new Square();
        System.out.println(square);
    }
}
