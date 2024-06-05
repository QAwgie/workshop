import java.util.Scanner;

class NumberAddition_1 {

    // Adding two numbers method
    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter another number: ");
        int num2 = scanner.nextInt();

        // Calling the method
        int sum = addNumbers(num1, num2);

        System.out.println("Adding " + num1 + " and " + num2 + " equals to: " + sum);
    }
}
