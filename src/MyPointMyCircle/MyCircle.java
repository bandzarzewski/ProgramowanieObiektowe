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

}
