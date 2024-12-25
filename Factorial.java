import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a nonnegative integer: ");
            int n = input.nextInt();
            System.out.println("Factorial of " + n + " is " + myfactorial(n));
        }
    }

    public static long myfactorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * myfactorial(n - 1);
    }
}