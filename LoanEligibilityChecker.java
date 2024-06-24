import java.util.Scanner;

class LoanEligibilityChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your annual salary: ");
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years you have been working at your current job: ");
        double yearsAtJob = scanner.nextDouble();

        if (isEligibleForLoan(salary, yearsAtJob)) {
            System.out.println("Congratulations! You are eligible for the loan!");
        } else {
            System.out.println("Unfortunately, you are ineligible for the loan.");
        }

        scanner.close();
    }

    public static boolean isEligibleForLoan(double salary, double yearsAtJob) {
        final double MIN_SALARY = 30000;
        final double MIN_YEARS_AT_JOB = 2;

        return salary >= MIN_SALARY && yearsAtJob >= MIN_YEARS_AT_JOB;
    }
}
