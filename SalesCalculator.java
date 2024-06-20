import java.util.Scanner;

class SalesCalculator {

    public static void salesCalculator(int salesMade) {
        final int Goal = 10;

        if (salesMade >= Goal) {
            System.out.println("Congratulations! You have met this week's sales goal.");
        } else {
            int salesShort = Goal - salesMade;
            System.out.println("You haven't met this week's sales goal, you were short " + salesShort + " sales.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of sales made this week: ");
        int salesMade = scanner.nextInt();

        salesCalculator(salesMade);

        scanner.close();
    }
}
