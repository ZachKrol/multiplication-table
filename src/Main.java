import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Initialize Scanner
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number to be the upper bound of a multiplication table: ");

            try {
                int num = scanner.nextInt();
                scanner.nextLine();
                printTable(num);

                boolean newTable = false;
                while (true) {
                    System.out.println("Would you like to print another multiplication table?");
                    System.out.println("Type 'yes' or 'no'");
                    String userInput = scanner.nextLine();
                    if (userInput.equalsIgnoreCase("yes")) {
                        newTable = true;
                        break;
                    } else if (userInput.equalsIgnoreCase("no")) {
                        newTable = false;
                        break;
                    } else {
                        System.out.println("You did not enter a valid input.");
                        continue;
                    }
                }

                if (newTable) {
                    System.out.println();
                    continue;
                } else {
                    System.out.println("Thank you! Have a great day!");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input. Please enter a valid integer.");
                System.out.println();
                scanner.nextLine(); // Clear the input buffer
            }
        }

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
}