package ShapeAndCircleAndRectangleAndSquare;

/**
 * Created by RENT on 2017-08-22.
 */
public class Rectangle extends Shape {
    private double _width = 1.0;
    private double _length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this._width = width;
        this._length = length;
    }

    public Rectangle(String color, boolean filled, double _width, double _length) {
        super(color, filled);
        this._width = _width;
        this._length = _length;
    }

    public double getWidth() {
        return _width;
    }

    public void setWidth(double _width) {
        this._width = _width;
    }

    public double getLength() {
        return _length;
    }

    public void setLength(double _length) {
        this._length = _length;
    }

    public double getArea() {
        return _length * _width;
    }

    public double getPerimeter() { // Perimeter - obwód
        return 2 * _length + 2 * _width;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("A Rectangle with width")
                .append(_width)
                .append(" and lenght")
                .append(_length)
                .append(" which is a subclass of ")
                .append(super.toString());
        return sb.toString();
    }
}
