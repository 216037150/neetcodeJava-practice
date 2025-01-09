import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your test1: ");
        double test1 = input.nextDouble();
        System.out.print("Enter your test2: ");
        double test2 = input.nextDouble();
        System.out.print("Enter your test3: ");
        double test3 = input.nextDouble();

        IsMarksValid checkMaxMinMarks = new IsMarksValid();

        if (!checkMaxMinMarks.isMarkPercentage(test1, test2, test3)) {
            System.out.println("Invalid marks entered. Please enter marks between 0 and 100.");
            return;
        }


        Marks getAverage  = new Marks();

        double result = getAverage.average(test1, test2, test3);

        System.out.println("//// //// HERE IS YOUR RESULTS //// ////");

        if(result < 50.0 ) {
            System.out.println("You got F: "+ result + "%");
            System.out.println("YOU FAILLED");
        } else if(result >= 50.0 && result<60.0){
            System.out.println("You got C: "+ result + "%");
            System.out.println("YOU PASSED");
        }else if(result >=60.0 && result <79.0){
            System.out.println("You got B: "+ result + "%");
            System.out.println("YOU PASSED");
        }else {
            System.out.println("Congrats, You got A: "+ result+ "%");
            System.out.println("YOU PASSED");
        }

    }

}
