package Piatek2508Powtorzenie.Zad1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RENT on 2017-08-25.
 */
public class MyTimeTest {
    @Test

    public void MyTimeTest() {
        MyTime myTime = new MyTime();
        myTime.setHour(10);
        Assert.assertEquals(10, myTime.getHour());
    }
}
