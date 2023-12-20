import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Initialize Scanner
        Scanner scanner = new Scanner(System.in);

        boolean newTable = true;
        while (newTable) {
            System.out.println("Enter a number to be the upper bound of a multiplication table: ");

            try {
                // Get user input
                int num = scanner.nextInt();

                // Check if integer is negative
                if (num < 1) {
                    throw new InputMismatchException("Invalid Input. Please enter a positive integer greater than 0.");
                }

                // Clear newline character from user input
                scanner.nextLine();

                // Print table
                printTable(num);

                // Ask user if they want another table
                newTable = anotherTable(scanner);

            } catch (InputMismatchException e) {
                System.out.println("Invalid Input. Please enter a positive integer.");
                System.out.println();
                scanner.nextLine(); // Clear the invalid input or newline from buffer
            }
        }
        System.out.println("Thank you! Have a great day!");

        // Close the scanner
        scanner.close();
    }

    private static void printTable(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static boolean anotherTable(Scanner scanner) {
        while (true) {
            System.out.println("Would you like to print another multiplication table?");
            System.out.println("Type 'yes' or 'no'");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("yes")) {
                System.out.println();
                return true;
            } else if (userInput.equalsIgnoreCase("no")) {
                System.out.println();
                return false;
            } else {
                System.out.println("You did not enter a valid input.");
                System.out.println();
                continue;
            }
        }
    }
}