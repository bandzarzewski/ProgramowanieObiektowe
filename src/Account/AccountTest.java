package Account;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Collection;

/**
 * Created by Maciek on 21.08.2017.
 */
public class AccountTest {
    Account account=new Account("Jeden","KontoOsobiste");
    @Test
    public void AccountGetID(){
        Assert.assertEquals("Jeden",account.getId());
    }


}
