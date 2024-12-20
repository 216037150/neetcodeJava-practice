import java.util.Scanner;

class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length = 0;
        double width = 0;

    
        while (true) {
            System.out.print("Enter the length of the rectangle: ");
            if (input.hasNextDouble()) { 
                length = input.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                input.next(); 
            }
        }

        while (true) {
            System.out.print("Enter the width of the rectangle: ");
            if (input.hasNextDouble()) { 
                width = input.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                input.next(); 
            }
        }

        double result = length * width;
        System.out.println("The area of a rectangle with a length of " + length +  " and width of " + width + " is: " + result + " units squared.");
    }
}
