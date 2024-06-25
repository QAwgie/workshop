import java.util.Scanner;

class ContainA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        boolean containsA = containsLetterA(input);

        if (containsA) {
            System.out.println("The string contains the letter 'A'.");
        } else {
            System.out.println("The string does not contain the letter 'A'.");
        }
    }

    public static boolean containsLetterA(String str) {
        String lowercaseStr = str.toLowerCase();
        return lowercaseStr.contains("a");
    }
}
