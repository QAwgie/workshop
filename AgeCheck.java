import java.util.Scanner;

class AgeCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        checkIfAdult(age);
        scanner.close();
    }

    public static void checkIfAdult(int age) {
        if (age >= 18) {
            System.out.println("Unfortunately, you're an adult.");
        } else {
            System.out.println("Congratulations, you're still a kid.");
        }
    }
}
