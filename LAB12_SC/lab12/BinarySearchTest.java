package lab12;



import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test
    public void testBinarySearchRecursive_Found() {
        int[] sortedArray = {1, 3, 5, 7, 9};
        int target = 5;
        int result = BinarySearch.binarySearchRecursive(sortedArray, target, 0, sortedArray.length - 1);
        assertEquals(2, result);
    }

    @Test
    public void testBinarySearchRecursive_NotFound() {
        int[] sortedArray = {1, 3, 5, 7, 9};
        int target = 4;
        int result = BinarySearch.binarySearchRecursive(sortedArray, target, 0, sortedArray.length - 1);
        assertEquals(-1, result);
    }

    @Test
    public void testBinarySearchRecursive_EmptyArray() {
        int[] sortedArray = {};
        int target = 1;
        int result = BinarySearch.binarySearchRecursive(sortedArray, target, 0, sortedArray.length - 1);
        assertEquals(-1, result);
    }

    @Test
    public void testBinarySearchRecursive_NullArray() {
        int[] sortedArray = null;
        int target = 1;
        try {
            BinarySearch.binarySearchRecursive(sortedArray, target, 0, 0);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected exception
        }
    }
}
