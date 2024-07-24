public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        // The pattern is for 5 rows and columns

        for (int i = 0; i < n; i++) {
            // Outer loop for rows
            for (int j = 0; j < n; j++) {
                // Inner loop for columns
                if (j < i) {
                    System.out.print((n - j) + " ");
                    // Print decreasing numbers from 'n - j'
                } else {
                    System.out.print((n - i) + " ");
                    // Print decreasing number from 'n - i'
                }
            }
            System.out.println();
            // Move to the next line
        }
    }
}
