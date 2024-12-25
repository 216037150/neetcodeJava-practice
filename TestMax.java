import java.util.Scanner;

public class TestMax {
    /** Main method */
    public static void main(String[] args) {
        int i;
        int j;
        try (Scanner numbers = new Scanner(System.in)) {
            System.out.print("Enter the value of i: ");
            i = numbers.nextInt();
            System.out.print("Enter the value of j: ");
            j = numbers.nextInt();
        }
        int k = max(i, j);
        System.out.println("The maximum value of " + i + " and " + j + " is " + k);
    }

    /** Return the max of two numbers */
    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2)
            result = num1;
        else
            result = num2;
        return result;
    }
}