import java.util.Scanner;

class SalaryCalculator {

    public static void salaryCalculator() {
        Scanner scanner = new Scanner(System.in);
        final int standardRate = 1000;
        final int bonus = 25;
        final int salesThreshold = 10;

        System.out.println("Enter the number of salespeople:");
        int numSalespeople = scanner.nextInt();

        int[] salesArray = new int[numSalespeople];

        for (int i = 0; i < numSalespeople; i++) {
            System.out.println("Enter the number of sales for salesperson " + (i + 1) + ":");
            int sales = scanner.nextInt();
            salesArray[i] = sales;
        }

        System.out.println("\nCalculating total salaries...\n");
        for (int i = 0; i < numSalespeople; i++) {
            int sales = salesArray[i];
            int totalSalary = standardRate;
            if (sales > salesThreshold) {
                totalSalary += bonus;
            }
            System.out.println("Total salary - salesperson " + (i + 1) + ": $" + totalSalary);
        }

        scanner.close();
    }

    public static void main(String[] args) {
        salaryCalculator();
    }
}
