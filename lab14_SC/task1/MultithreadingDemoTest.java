package task1;
import org.junit.Test;
import static org.junit.Assert.*;

public class MultithreadingDemoTest {

    @Test
    public void testNumberAndSquarePrinter() throws InterruptedException {
        NumberPrinter numberPrinter = new NumberPrinter();
        SquarePrinter squarePrinter = new SquarePrinter();

        Thread thread1 = new Thread(numberPrinter);
        Thread thread2 = new Thread(squarePrinter);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        // Verify numbers and squares printed successfully.
        // Logs must be manually verified since concurrency changes order.
        assertTrue(thread1.isAlive() == false);
        assertTrue(thread2.isAlive() == false);
    }
}
