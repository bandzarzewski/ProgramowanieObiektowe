package Rectangle;

/**
 * Created by RENT on 2017-08-18.
 */
public class Rectangle {
    private float _lenght = 1.0f;
    private float _width = 1.0f;

    public Rectangle() {
    }

    public Rectangle(float lenght, float width) {
        _lenght = lenght;
        _width = width;
    }

    public float getLenght() {
        return _lenght;
    }

    public void setLenght(float lenght) {
        _lenght = lenght;
    }

    public float getWidth() {
        return _width;
    }

    public void setWidth(float width) {
        _width = width;
    }

    public double getArea() {
        return _lenght * _width;
    }

    public double getPermiter() {
        return (2 * _lenght) + (2 * _width);
    }

    public String toString() {
        return "Rectangle[length=" + _lenght + " ,width=" + _width + "]";
    }

}