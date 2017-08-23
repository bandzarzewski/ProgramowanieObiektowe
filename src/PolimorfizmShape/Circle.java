package PolimorfizmShape;

/**
 * Created by RENT on 2017-08-22.
 */
public class Circle extends Shape {
    protected double _radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this._radius = radius;
    }

    public Circle(String color, boolean filled, double _radius) {
        super(color, filled);
        this._radius = _radius;
    }

    public double getRadius() {
        return _radius;
    }

    public void setRadius(double _radius) {
        this._radius = _radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(_radius, 2d);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * _radius;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" A Circle with radius=")
                .append(_radius)
                .append(", which is a subclass of ")
                .append(super.toString()); // odwołanie do klasy nadrzedniej
        return sb.toString();
    }
}
