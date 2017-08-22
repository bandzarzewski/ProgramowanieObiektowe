package Dziedziczenie.CircleAndCylinder;

/**
 * Created by RENT on 2017-08-22.
 */
public class Cylinder extends Circle {

    private double _height = 1.0;

    public Cylinder() {
        super();
    }

    public Cylinder(double r) {
        super(r);
    }

    public Cylinder(double r, double height) {
        super(r);
        this._height = height;
    }

    public Cylinder(double r, String color, double height) {
        super(r, color);
        this._height = height;
    }

    public double getHeight() {
        return _height;
    }

    public void setHeight(double height) {
        _height = height;
    }

    public double getVolume() {
        return getArea() * _height;

    }
}
