package Rectangle;

import org.junit.Assert;
import org.junit.Test;


public class RectangleTest {
    @Test
    public void RectangleGetLenghtTest() {
        Rectangle rectangle = new Rectangle();
        Assert.assertEquals(1.0f, rectangle.getLenght(), 0.01);
    }

    @Test
    public void RectangleSetLenghtTest() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLenght(2);
        Assert.assertEquals(2, rectangle.getLenght(), 0.1);
    }

    @Test
    public void RectangleGetWidthTest() {
        Rectangle rectangle = new Rectangle();
        Assert.assertEquals(1, rectangle.getWidth(), 0.1);
    }

    @Test
    public void RectangleSetWitdhTest() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(2);
        Assert.assertEquals(2, rectangle.getWidth(), 0.1);
    }

    @Test
    public void RectangleGetAreaTest() {
        Rectangle rectangle = new Rectangle();
        Assert.assertEquals(1, rectangle.getArea(), 0.1);
    }

    @Test
    public void RectangleGetPerimetrTest() {
        Rectangle rectangle = new Rectangle();
        Assert.assertEquals(4, rectangle.getPermiter(), 0.1);
    }

    @Test
    public void RectangleToStringTest() {
        Rectangle rectangle = new Rectangle();
        Assert.assertEquals("Rectangle[length=1.0 ,width=1.0]", rectangle.toString());
    }
}
