import java.util.Scanner;

class EmployeePayCalculator {

    private static final double HOURLY_PAY_RATE = 15.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of employees: ");
        int numberOfEmployees = scanner.nextInt();

        double[] hoursWorked = new double[numberOfEmployees];

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Enter the number of weekly hours worked for employee " + (i + 1) + ": ");
            hoursWorked[i] = scanner.nextDouble();
        }

        for (int i = 0; i < numberOfEmployees; i++) {
            double pay = hoursWorked[i] * HOURLY_PAY_RATE;
            System.out.println("\nEmployee " + (i + 1) + " earned $\n" + String.format("%.2f", pay));
        }

    }
}
