import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        System.out.println("Multiplication Table of: " + n);
        for (int c = 0; c<=n; c++){
            System.out.println(n + "  *  " +  c  + "  =  " + ( n*c ) );
        }
    }
}
