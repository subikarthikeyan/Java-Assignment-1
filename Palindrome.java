import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Initialize Scanner object

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reverse_Number = 0;

        //reverse the numbers //

        while (number != 0) {
            int digit = number % 10;
            reverse_Number = reverse_Number * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed number: " + reverse_Number);

        scanner.close();
    }
}
