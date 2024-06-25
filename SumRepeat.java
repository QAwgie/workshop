import java.util.Scanner;

class SumRepeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueCalculation;

        do {
            System.out.println("Enter the first number: ");
            double number1 = scanner.nextDouble();

            System.out.println("Enter the second number: ");
            double number2 = scanner.nextDouble();

            double sum = number1 + number2;
            System.out.println("The sum of " + number1 + " and " + number2 + " is " + sum);

            System.out.println("Perform another calculation? (yes/no): ");
            continueCalculation = scanner.next();
        } while (continueCalculation.equalsIgnoreCase("yes"));
    }
}
