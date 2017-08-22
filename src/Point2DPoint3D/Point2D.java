package Point2DPoint3D;

/**
 * Created by RENT on 2017-08-22.
 */
public class Point2D {
    private float _x = 0.0f;
    private float _y = 0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this._x = x;
        this._y = y;
    }

    public float getX() {
        return _x;
    }

    public void setX(float x) {
        this._x = x;
    }

    public float getY() {
        return _y;
    }

    public void setY(float y) {
        this._y = y;
    }

    public void setXY(float x, float y) {
        this._x = x;
        this._y = y;
    }

    public float[] getXY() {
        return new float[]{_x, _y};  // zwracamy tablice float !
    }

    public String toString() {
        return String.format("%f %f", _x, _y);
    }
}
