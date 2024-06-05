import java.util.Scanner;

public class OddEvenChecker {

    // Even/Odd checker method
    public static String checkOddOrEven(int number) {
        String result = (number % 2 == 0) ? "even" : "odd";
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calling the method
        String result = checkOddOrEven(number);

        // Print results
        System.out.println("Number " + number + " is " + result + ".");
    }
}
