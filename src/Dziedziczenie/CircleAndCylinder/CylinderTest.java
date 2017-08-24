package Dziedziczenie.CircleAndCylinder;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RENT on 2017-08-22.
 */
public class CylinderTest {
    @Test
    public void CylinderGetHeightTest() {
        Cylinder cylinder = new Cylinder();
        Assert.assertEquals(1.0, cylinder.getHeight(), 0.01);
    }

    @Test
    public void CylinderSetHeightTest() {
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(3.0);
        Assert.assertEquals(3.0, cylinder.getHeight(), 0.01);
    }

    @Test
    public void CylinderGetVolumeTest() {
        Cylinder cylinder = new Cylinder();
        Assert.assertEquals(3.141592653589793, cylinder.getVolume(), 0.01);
    }


}

