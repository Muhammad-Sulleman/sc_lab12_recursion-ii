package task2;
import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadSynchronizationTest {

    @Test
    public void testSynchronizedCounter() throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new CounterThread(counter);
        Thread t2 = new CounterThread(counter);
        Thread t3 = new CounterThread(counter);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        assertEquals(300, counter.getCount());
    }
}
