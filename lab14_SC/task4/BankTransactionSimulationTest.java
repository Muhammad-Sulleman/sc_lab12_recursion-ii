package task4;

import org.junit.Test;
import static org.junit.Assert.*;

public class BankTransactionSimulationTest {

    @Test
    public void testBankAccountTransactions() throws InterruptedException {
        BankAccount account = new BankAccount();

        Thread client1 = new Client(account);
        Thread client2 = new Client(account);
        Thread client3 = new Client(account);

        client1.start();
        client2.start();
        client3.start();

        client1.join();
        client2.join();
        client3.join();

        // Verify that the balance remains non-negative after all transactions
        assertTrue(account.getBalance() >= 0);
    }
}
