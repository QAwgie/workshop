import java.util.Scanner;

class AverageScore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numStudents = 24;
        int numTests = 4;

        double[][] testScores = new double[numStudents][numTests];

        for (int student = 0; student < numStudents; student++) {
            System.out.printf("Enter scores for student %d (separated by spaces): \n", student + 1);
            for (int test = 0; test < numTests; test++) {
                testScores[student][test] = scanner.nextDouble();
            }
        }

        for (int student = 0; student < numStudents; student++) {
            double sum = 0;
            for (int test = 0; test < numTests; test++) {
                sum += testScores[student][test];
            }
            double average = sum / numTests;
            System.out.printf("Average score for student %d: %.2f\n", student + 1, average);
        }
    }
}
