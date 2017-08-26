package Piatek2508Powtorzenie.Zad1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RENT on 2017-08-25.
 */
public class MyTimeTest {
    @Test
    public void MyTimeSetTimeTest() {
        MyTime myTime = new MyTime();
        myTime.setTime(18, 45, 49);
        Assert.assertEquals(18, myTime.getHour());
        Assert.assertEquals(45, myTime.getMinute());
        Assert.assertEquals(49, myTime.getSecond());
    }

    @Test
    public void MyTimeGetTimeTest() {
        MyTime myTime = new MyTime(3, 8, 29);
        Assert.assertEquals(3, myTime.getHour());
        Assert.assertEquals(8, myTime.getMinute());
        Assert.assertEquals(29, myTime.getSecond());
    }

    @Test
    public void MyTimeToString() {
        MyTime myTime = new MyTime();

    }
}
