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

    public int getCenterX() {
        return _center.getX();
    }

    public void setCenterX(int x) {
        _center.setX(x);
    }

    public int getCenterY() {
        return _center.getY();
    }

    public void setCenterY(int y) {
        _center.setY(y);
    }

    public int[] getCenterXY() {
        return _center.getXY();
    }

    public void setCenterXY(int x, int y) {
        _center.setXY(x, y);
    }

}


