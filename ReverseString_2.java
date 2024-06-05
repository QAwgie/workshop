import java.util.Scanner;

class ReverseString_2 {

    // Method for reversing a string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text you want reversed: ");
        String ogString = scanner.nextLine();

        // Calling the method
        String antiString = reverseString(ogString);

        System.out.println("There ya go: " + antiString);
    }
}
