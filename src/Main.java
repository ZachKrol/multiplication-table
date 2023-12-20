import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Initialize Scanner
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number to be the upper bound of a multiplication table: ");

            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                scanner.nextLine();
                for (int i = 1; i <= num; i++) {
                    for (int j = 1; j <= num; j++) {
                        System.out.print(i * j + "\t");
                    }
                    System.out.println();
                }
                System.out.println();

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

                if (newTable == true) {
                    System.out.println();
                    continue;
                } else {
                    System.out.println("Thank you! Have a great day!");
                    break;
                }

            } else {
                System.out.println("Invalid Input. Please enter a positive integer.");
                System.out.println();
                scanner.nextLine();
                continue;
            }
        }

        // Close the scanner
        scanner.close();
    }
}
