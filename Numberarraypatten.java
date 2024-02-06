public class Numberarraypatten {
    public static void main(String[] args) {
        int n = 4; // specify the number of rows for the pattern
        int[][] pattern = new int[n][n];

        // Fill the array with the pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                pattern[i][j] = j + 1;
            }
        }

        // Print the pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pattern[i][j]);
            }
            System.out.println();
        }
    }
}

