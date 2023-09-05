public class Main {
    /** Recursive method to calculate the nth Fibonacci term.
     * The Fibonacci sequence starts with 0 and 1, where each subsequent number
     * is the sum of the two preceding numbers.
     *
     * @param n The position in the Fibonacci sequence for which to caluclate the value.
     * @return The number at position 'n' of the Fibonacci sequence.
     * @throws IllegalArgumentException if 'n' is a negative number.
     */
    public static int calculateFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10; // Change this value to calculate a different term in the sequence
        int nthTerm = calculateFibonacci(n);

        System.out.println("The " + n + "th term of the Fibonacci sequence is " + nthTerm + ".");
    }
}
