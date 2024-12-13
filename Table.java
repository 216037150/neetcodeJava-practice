public class Table {
    public static void main(String[] args) {
        int n = 12;
        for(int i = 1; i<=n; i++) {
            System.out.println("\t");
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + "\t");

            }

        }
    }
}