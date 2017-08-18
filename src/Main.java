import Circle.Circle;

public class Main {

    public static void main(String[] args) {

        Circle c = new Circle(4.0);
        System.out.println(c);

        c.setColor("green");
        c.getColor();
        System.out.println(c);
        c.setRadius(6);
        c.getRadius();
        System.out.println(c);
        c.setRadius(1);

        System.out.println("Obwód koła: " + c.getCircumference());


    }
}