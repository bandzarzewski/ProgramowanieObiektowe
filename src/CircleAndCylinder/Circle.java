package CircleAndCylinder;

/**
 * Created by RENT on 2017-08-22.
 */
public class Circle {
    private double _radius = 1.0;
    private String _color = "red";

    public Circle() {
    }
    // kostruktor bezargumentowy

    public Circle(double r) {
        _radius = r;
    }

    public Circle(double r, String color) {
        _radius = r;
        _color = color;
    }

    public double getRadius() {
        return _radius;
    }

    public void setRadius(double radius) {
        _radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(_radius, 2d);
        // 2d - 2 jest rzutowane na double
    }

    public String getColor() {
        return _color;
    }

    public void setColor(String color) {
        _color = color;
    }

    public double getCircumference() {
        return Math.PI * 2 * _radius;
    }

    public String toString() {
        // StringBuilder
        return "Circle[radus=" + _radius + " ,color=" + _color + "]";
    }

}
