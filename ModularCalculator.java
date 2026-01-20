public class ModularCalculator {

    // ---------------- MAIN METHOD ----------------
    public static void main(String[] args) {

        // Testing calculator methods
        printResult("Addition", add(10, 20));
        printResult("Addition (3 numbers)", add(5, 10, 15));
        printResult("Addition (double)", add(5.5, 4.5));

        printResult("Subtraction", subtract(20, 10));
        printResult("Multiplication", multiply(5, 4));

        // Exception handling for division
        try {
            printResult("Division", divide(10, 2));
            printResult("Division", divide(10, 0)); // will cause exception
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Pass-by-value demonstration
        int number = 5;
        modifyValue(number);
        System.out.println("Outside method number = " + number);
    }

   // ---------------- CALCULATOR METHODS ----------------

     /**
     * Adds two numbers:
     */
    public static int add(int a, int b) {
        return a + b;
    }

     /**
     * Adds three digits:
     */
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * Adds two velues
     */
    public static double add(double a, double b) {
        return a + b;
    }

    /**
     * Difference between b and a
     */
    public static int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two numbers:
     */
    public static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides two digits:
     * Throws exception if divisor is zero
     */
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    // ---------------- UTILITY METHOD ----------------

    /**
     * Prints the result of an operation
     */
    public static void printResult(String operation, double result) {
        System.out.println(operation + " Result: " + result);
    }

    // ---------------- PASS-BY-VALUE DEMO ----------------

    /**
     * Demonstrates Java pass-by-value behavior
     */
    public static void modifyValue(int x) {
        x = x + 10;
        System.out.println("Inside method x = " + x);
    }
}
  
