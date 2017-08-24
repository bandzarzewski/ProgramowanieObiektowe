package MyPointMyCircle;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maciek on 24.08.2017.
 */
public class MyPointTest {
    @Test

    public void MyPointGetXandYTest() {
        MyPoint myPoint = new MyPoint(1, 4);
        Assert.assertEquals(1, myPoint.getX());
        Assert.assertEquals(4, myPoint.getY());
    }

    @Test
    public void MyPointSetXandYTest() {
        MyPoint myPoint = new MyPoint();
        myPoint.setX(3);
        myPoint.setY(6);
        Assert.assertEquals(3, myPoint.getX());
        Assert.assertEquals(6, myPoint.getY());

    }

    @Test
    public void MyPointGetXYTest() {
        MyPoint myPoint = new MyPoint(3, 3);
        Assert.assertArrayEquals(new int[]{3, 3}, myPoint.getXY());
    }

    @Test
    public void MyPointSetXYTest() {
        MyPoint myPoint = new MyPoint();
        myPoint.setXY(5, 7);
        Assert.assertEquals(5, myPoint.getX());
        Assert.assertEquals(7, myPoint.getY());
        Assert.assertArrayEquals(new int[]{5, 7}, myPoint.getXY());
    }

    @Test
    public void MyPointToStringTest() {
        MyPoint myPoint = new MyPoint();
        Assert.assertEquals("(x=0,y=0)", myPoint.toString());

    }


    @Test
    public void MyPointDistanceIntXIntYTest() {
        MyPoint myPoint = new MyPoint(10, 10);
        Assert.assertEquals(7.07, myPoint.distance(5, 5), 0.01);

    }

    @Test
    public void MyPointDistanceAnotherMyPointTest() {
        MyPoint myPoint = new MyPoint(10, 10);
        Assert.assertEquals(14.14, myPoint.distance(), 0.01);
    }
}
