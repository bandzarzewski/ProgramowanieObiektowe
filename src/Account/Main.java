package Account;

/**
 * Created by Maciek on 25.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Account account = new Account("Pierwszy", "Jan", 4000);
        account.debit(4500);
//        Account account2 = new Account("Drugi", "Adam", 4500);
//        account2.transferTo(1864, account);
//        System.out.println(account);

    }
}
