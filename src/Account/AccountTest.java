package Account;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maciek on 21.08.2017.
 */
public class AccountTest {
    Account account = new Account("Jeden", "KontoOsobiste");

    @Test
    public void AccountGetIDTest() {
        Assert.assertEquals("Jeden", account.getId());
    }

    @Test
    public void AccountCreditTest() {
        Account account = new Account(4000);
        Assert.assertEquals(4500, account.credit(500));
    }

    @Test
    public void AccountTransferToTest() {
        Account account = new Account(4000);
        Account account1 = new Account(10000);
        Assert.assertEquals(2550, account.transferTo(1450, account1));
    }

    @Test
    public void AccountDebitTest() {
        Account account = new Account("3R", "Asia");
        Assert.assertEquals(0, account.debit(4500));
    }


}
