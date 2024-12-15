import java.util.Scanner;
class Weird{
    /*
    
    Task
Given an integer,N , perform the following conditional actions:

If N is odd, print Weird
If N is even and in the inclusive range of 2 to 5, print Not Weird
If N is even and in the inclusive range of 6 to 20, print Weird
If N is even and greater than 20, print Not Weird
    */

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value of n: ");
        int N = scanner.nextInt();
        scanner.close();

        if(N%2 == 1){
            System.out.println("Weird");

        }else if(N%2 == 0 && N >=2 && N<5 ){
            System.out.println("Not Weird");

        }else if(N%2 == 0 && N >=6 && N<20 ){
            System.out.println(" Weird");

        }else if(N%2 == 0 && N > 20){
            System.out.println("Not Weird");
        }
    }

}
