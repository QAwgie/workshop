import java.util.Scanner;

class PrintMessage_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String message = scanner.nextLine();
        System.out.println("Your entered message is: " + '"' + message + '"');
    }
}
