import java.util.Scanner;

public class OddEvenChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String result = (number % 2 == 0) ? "even" : "odd";
        System.out.println(number + " is " + result + ".");
    }
}
