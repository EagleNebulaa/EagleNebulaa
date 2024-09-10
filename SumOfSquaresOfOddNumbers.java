import java.util.ArrayList;
import java.util.List;

public class SumOfSquaresOfOddNumbers {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

        // Step 2: Use the Stream API to process the list
        int sumOfSquares = numbers.stream()  // Convert the list to a stream
            .filter(n -> n % 2 != 0)         // Filter to keep only odd numbers
            .map(n -> n * n)                 // Square each odd number
            .reduce(0, Integer::sum);       // Sum up the squares

        // Print the result
        System.out.println("Sum of squares of odd numbers: " + sumOfSquares);
    }
}
