package MyPointMyCircle;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maciek on 23.08.2017.
 */
public class MyCircleTest {
    @Test
    public void MyCircleGetSetRadiusTest() {
        MyCircle myCircle = new MyCircle();
        myCircle.setRadius(2);
        Assert.assertEquals(2, myCircle.getRadius());
    }

    @Test
    public void MyCircleMyPointGetCenterTest() {
        MyCircle myCircle = new MyCircle();
        Assert.assertEquals(0, myCircle.getCenter().getX());
        Assert.assertEquals(0, myCircle.getCenter().getY());

    }

    @Test
    public void MyCircleSetCenter() {
        MyCircle myCircle = new MyCircle();
        myCircle.setCenter(new MyPoint(1, 1));
        Assert.assertEquals(1, myCircle.getCenter().getX());
        Assert.assertEquals(1, myCircle.getCenter().getY());

    }

    @Test
    public void MyCircleGetCenterX() {
        MyCircle myCircle = new MyCircle();
        Assert.assertEquals(0, myCircle.getCenterX());
    }

    @Test
    public void MyCircleSetCenterX() {
        MyCircle myCircle = new MyCircle();
        myCircle.setCenterX(5);
        Assert.assertEquals(5, myCircle.getCenterX());
    }

    @Test
    public void MyCircleGetCenterXY() {
        MyCircle myCircle = new MyCircle();
        Assert.assertArrayEquals(new int[]{0, 0}, myCircle.getCenterXY());
    }

    @Test
    public void MyCircleSetCenterXY() {
        MyCircle myCircle = new MyCircle();
        myCircle.setCenterXY(5, 5);
        Assert.assertArrayEquals(new int[]{5, 5}, myCircle.getCenterXY());
    }

    @Test
    public void MyCircleGetArea() {
        MyCircle myCircle = new MyCircle();
        Assert.assertEquals(3.14, myCircle.getArea(), 0.01);
    }

    @Test
    public void MyCircleCircumferenceTest() {
        MyCircle myCircle = new MyCircle();
        Assert.assertEquals(6.28, myCircle.getCircumference(), 0.01);
    }


}
