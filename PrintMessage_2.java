import java.util.Scanner;

class PrintMessage_2 {

    // Method for reading and printing a message
    public static void readAndPrintMessage() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String message = scanner.nextLine();
        System.out.println("Your entered message is: " + '"' + message + '"');
    }
        // Calling the method
    public static void main(String[] args) {
        readAndPrintMessage();
    }
}
