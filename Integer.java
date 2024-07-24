import java.util.Scanner;
public class Integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Initialize Scanner object//

        System.out.print("Enter the n:");
        int n = scanner.nextInt();
        // to find the given number is positive or negative //
        if (n > 0) {
            System.out.println("the given number is positive");
        } else if (n < 0) {
            System.out.println("the given is negative");
        } else {
            System.out.println("the number is equal to zero");
        }

        scanner.close();
    }
}
