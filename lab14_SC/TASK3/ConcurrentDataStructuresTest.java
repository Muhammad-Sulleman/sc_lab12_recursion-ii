package TASK3;

import org.junit.Test;
import java.util.concurrent.CopyOnWriteArrayList;
import static org.junit.Assert.*;

public class ConcurrentDataStructuresTest {

    @Test
    public void testConcurrentListModification() throws InterruptedException {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        Thread t1 = new ListModifier(list);
        Thread t2 = new ListModifier(list);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // Verify the total number of elements in the list
        assertEquals(20, list.size());
    }
}
