import java.util.Arrays;
import java.util.Random;

public class HelloWorld {
   public static void main(String[] args) {
        System.out.println("🔥 Welcome to the Java Program! 🔥\n");

        // 1️⃣ Basic Math Operations
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Power (10^5): " + Math.pow(a, b));

        // 2️⃣ Factorial of Numbers (1-5)
        System.out.println("\nFactorials:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "! = " + factorial(i));
        }

        // 3️⃣ Prime Number Check
        System.out.println("\nPrime Numbers from 1 to 20:");
        for (int i = 1; i <= 20; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
        System.out.println();

        // 4️⃣ Array Sorting
        int[] numbers = {45, 12, 89, 32, 10};
        Arrays.sort(numbers);
        System.out.println("\nSorted Array: " + Arrays.toString(numbers));

        // 5️⃣ Fibonacci Series (First 10 numbers)
        System.out.println("\nFibonacci Series (First 10 numbers):");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();

        // 6️⃣ String Manipulations
        String text = "Hello, Jenkins!";
        System.out.println("\nOriginal String: " + text);
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Reversed: " + reverseString(text));

        // 7️⃣ 2D Array Printing
        System.out.println("\n2D Array:");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        // 8️⃣ Random Number Generation
        System.out.println("\nRandom Numbers:");
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.print(rand.nextInt(100) + " ");
        }
        System.out.println("\n");

        System.out.println("✅ Program execution complete!");
    }

    // Method to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Method to calculate Fibonacci series
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
