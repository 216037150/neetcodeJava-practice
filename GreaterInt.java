import java.util.Scanner;

public class GreaterInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declare the variables
        int x;
        int y;
        int z;

        // Take input from the user
        System.out.print("Enter the value of x: ");
        x = input.nextInt();

        System.out.print("Enter the value of y: ");
        y = input.nextInt();

        System.out.print("Enter the value of z: ");
        z = input.nextInt();

        // compare variables, to find which one is the greatest
        if(x>y && x>z){
            System.out.println("X is greater");
        } else if (y>z) {
            System.out.println("Y is greater");
        }else {
            System.out.println( "Z is greater");
        }
    }
}
