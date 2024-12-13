import java.util.Scanner;

public class UserInput{
    public static void main(String[] args) {
        int a = 436;
        byte b = 45;
        b = (byte)a;
        System.out.println(b);

        String name;
        String surname;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: " );
        name = input.nextLine();
        System.out.println("Hello "+ name);


        System.out.print("Please enter your surname: " );
        surname = input.nextLine();
        System.out.println("Greetings Mr. " + surname);


    }
}
