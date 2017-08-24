package MyPointMyCircle;

/**
 * Created by RENT on 2017-08-21.
 */
public class MyPoint {
    private int _x = 0;
    private int _y = 0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this._x = x;
        this._y = y;
    }

    public int getX() {
        return _x;
    }

    public void setX(int x) {
        this._x = x;
    }

    public int getY() {
        return _y;
    }

    public void setY(int y) {
        this._y = y;
    }

    public int[] getXY() {
        return new int[]{_x, _y};
    }

    public void setXY(int x, int y) {
        this._x = x;
        this._y = y;
    }

    public String toString() {
        return String.format("(x=%d,y=%d)", _x, _y);
    }

    public double calculatorDistance(int x, int y) {
        double pX = Math.pow((x - this._x), 2.0);
        double pY = Math.pow((y - this._y), 2.0);
        return Math.sqrt(pX + pY);
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow((x - _x), 2.0) + Math.pow((y - _y), 2.0));
    }

    public double distance(MyPoint another) {
        return Math.sqrt(Math.pow((another._x - _x), 2) + Math.pow((another._x - _y), 2));
    }

    public double distance() {
        return calculatorDistance(0, 0);
//        return Math.sqrt(Math.pow((0 - getX()), 2) + Math.pow((0 - getY()), 2));
//        return Math.sqrt(Math.pow(_x, 2) + Math.pow(_y, 2));

    }
}

