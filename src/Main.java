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
                scanner.nextLine();
                printTable(num);

                // Ask user if they want another table
                newTable = anotherTable(scanner);
                System.out.println();

            } catch (InputMismatchException e) {
                System.out.println("Invalid Input. Please enter a valid integer.");
                System.out.println();
                scanner.nextLine(); // Clear the invalid input from buffer
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
                return true;
            } else if (userInput.equalsIgnoreCase("no")) {
                return false;
            } else {
                System.out.println("You did not enter a valid input.");
                continue;
            }
        }
    }
}