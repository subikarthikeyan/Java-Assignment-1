import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter the a:");
        int a =scanner.nextInt();

        System.out.print("Enter the n:");
        int n =scanner.nextInt();

        // to print the number from 10 to 50 using for loop//
        for (int i=a; i<=n; i++) {
            System.out.println("the numbers are :"+i);
        }
        scanner.close();

    }
}
