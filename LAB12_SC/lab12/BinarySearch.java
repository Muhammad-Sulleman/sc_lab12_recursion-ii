package lab12;

public class BinarySearch {
    public static int binarySearchRecursive(int[] array, int target, int low, int high) {
        if (low > high) {
            return -1; // Base case: Target not found
        }
        int mid = low + (high - low) / 2;
        if (array[mid] == target) {
            return mid; // Target found
        } else if (array[mid] > target) {
            return binarySearchRecursive(array, target, low, mid - 1); // Search left half
        } else {
            return binarySearchRecursive(array, target, mid + 1, high); // Search right half
        }
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9};
        int target = 5;
        int result = binarySearchRecursive(sortedArray, target, 0, sortedArray.length - 1);
        System.out.println("Index of " + target + ": " + result);
    }
}
