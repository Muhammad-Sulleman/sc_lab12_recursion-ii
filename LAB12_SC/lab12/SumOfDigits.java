package lab12;

public class SumOfDigits {
    public static int sumOfDigits(int number) {
        if (number == 0) {
            return 0; // Base case
        }
        return Math.abs(number % 10) + sumOfDigits(Math.abs(number / 10)); // Recursive case
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Sum of digits: " + sumOfDigits(number));
    }

	
}
