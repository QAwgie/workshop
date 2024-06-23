import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter points:");

        if (scanner.hasNextInt()) {
            int score = scanner.nextInt();

            if (score >= 90 && score <= 100) {
                System.out.println("Grade: A");
            } else if (score >= 80 && score < 90) {
                System.out.println("Grade: B");
            } else if (score >= 70 && score < 80) {
                System.out.println("Grade: C");
            } else if (score >= 60 && score < 70) {
                System.out.println("Grade: E");
            } else if (score >= 0 && score < 60) {
                System.out.println("Grade: F");
            } else {
                System.out.println("Error: Inaccurate amount of points entered.");
            }
        } else {
            System.out.println("Error: Inaccurate amount of points entered.");
        }
    }
}
