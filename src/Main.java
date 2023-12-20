import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a number to be the upper bound of a multiplication table: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(i * j);
            }
            System.out.println();
        }

    }
}
