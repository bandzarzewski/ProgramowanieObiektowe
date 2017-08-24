package MyPointMyCircle;

/**
 * Created by RENT on 2017-08-21.
 */
public class MyCircle {
    private int _radius = 1;
    private MyPoint _center = new MyPoint(0, 0);

    public MyCircle() {
    }

    public MyCircle(int radius, int x, int y) {
        this._radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this._radius = radius;
        this._center = center;
    }

    public int getRadius() {
        return _radius;
    }

    public void setRadius(int radius) {
        this._radius = radius;
    }

    public MyPoint getCenter() {
        return _center;
    }

    public void setCenter(MyPoint center) {
        this._center = center;
    }

    public int getCenterX() {
        return _center.getX();
    }

    public void setCenterX(int x) {
        this._center.setX(x);
    }

    public int getCenterY() {
        return _center.getY();
    }

    public void setCenterY(int y) {
        this._center.setY(y);
    }

    public int[] getCenterXY() {
        return _center.getXY();
    }

    public void setCenterXY(int x, int y) {
        _center.setXY(x, y);
    }

    public String toString() {
        return String.format("MyCircle[radius=%d ,center=(%d,&d)]", _radius, _center.toString());
    }

    public double getArea() {
        return Math.PI * (Math.pow(_radius, 2));
    }

    public double getCircumference() { // obwód koła
        return 2 * Math.PI * _radius;
    }

    public double distance(MyCircle another) {
        return _center.distance();
    }

}


