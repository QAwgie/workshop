import java.util.Scanner;

class NumberAddition_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter another number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter a third number: ");
        int num3 = scanner.nextInt();

        int sum = num1 + num2 + num3;

        System.out.println("Adding " + num1 + ", " + num2 + " and " + num3 + " equals to: " + sum + ", and the number is " + (sum % 2 == 0 ? "even." : "odd."));
    }
}
