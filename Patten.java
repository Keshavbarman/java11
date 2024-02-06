public class Patten {
    public static void main(String[] args) {
        int n = 4; // specify the number of rows for the pattern

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
