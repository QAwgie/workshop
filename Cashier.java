import java.util.Scanner;

class Cashier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of items: ");
        int numberOfItems = scanner.nextInt();

        double totalCost = 0.0;

        for (int i = 1; i <= numberOfItems; i++) {
            System.out.println("Enter the price of item " + i + ": ");
            double price = scanner.nextDouble();
            totalCost += price;
        }

        System.out.println("Total cost: $" + totalCost);
    }
}
