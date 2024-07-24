import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the purchase amount
        System.out.print("Enter the purchase amount: ");
        double purchaseAmount = scanner.nextDouble();

        double discount = 0;
        double finalAmount = purchaseAmount;

        // Determine the discount based on the purchase amount
        if (purchaseAmount < 500) {
            // No discount for amounts less than 500
            discount = 0;
        } else if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
            // 10% discount for amounts between 500 and 1000
            discount = purchaseAmount * 0.10;
        } else if (purchaseAmount > 1000) {
            // 20% discount for amounts greater than 1000
            discount = purchaseAmount * 0.20;
        }

        // Calculate the final amount after applying the discount
        finalAmount = purchaseAmount - discount;

        // Output the final payable amount
        System.out.println("The final payable amount after discount is: " + finalAmount);

        // Close the scanner
        scanner.close();
    }
}
