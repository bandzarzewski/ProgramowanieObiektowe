package Circle;


import org.junit.Assert;
import org.junit.Test;

public class CircleTest {
    @Test

    public void CircleAreaTest() {
        Circle cirlce = new Circle();
        Assert.assertEquals(3.14, cirlce.getArea(), 0.01);
    }

    @Test
    public void CircleAreaRadius2Test() {
        Circle cirlce = new Circle(2.0);
        Assert.assertEquals(12.56d, cirlce.getArea(), 0.01);
    }

    @Test
    public void CircleRadius2Test() {
        Circle cirlce = new Circle();
        Assert.assertEquals(1.0, cirlce.getRadius(), 0.1);
    }

    @Test
    public void CircleRadius2StringTest() {
        Circle cirlce = new Circle(2.0);
        Assert.assertEquals("Circle[radus=2.0 ,color=red]", cirlce.toString());
    }
}
