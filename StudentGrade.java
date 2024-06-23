import java.util.Scanner;

class StudentGrade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesi ocjenu (A-F): ");
        char grade = scanner.next().charAt(0);
        printFeedback(grade);
        scanner.close();
    }

    public static void printFeedback(char grade) {
        switch (grade) {
            case 'A':
                System.out.println("Bra'o, bra'o. Najjači si.");
                break;
            case 'B':
                System.out.println("Dobar, ali nisi najjači.");
                break;
            case 'C':
                System.out.println("Daleko od najjačeg, ali OK");
                break;
            case 'D':
                System.out.println("Podnošljivo...");
                break;
            case 'E':
                System.out.println("Jedva si se provukao...");
                break;
            case 'F':
                System.out.println("Užas, pakao, pakao...");
                break;
            default:
                System.out.println("Error: Nema ti toga.");
        }
    }
}
