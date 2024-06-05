import java.util.Scanner;

class ReverseString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text you want reversed: ");
        String ogString = scanner.nextLine();

        String antiString = new StringBuilder(ogString).reverse().toString();

        System.out.println("There ya go: " + antiString);
    }
}
