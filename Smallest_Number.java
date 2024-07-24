import java.util.Scanner;

public class Smallest_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the smallest number using if-else statements
        int smallest = num1;

        if (num2 < smallest) {
            smallest = num2;
        }

        if (num3 < smallest) {
            smallest = num3;
        }

        // Output the smallest number
        System.out.println("The smallest number is: " + smallest);

        // Close the scanner
        scanner.close();
    }
}
