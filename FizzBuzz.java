import java.util.ArrayList;

/*
 * "FizzBuzz" if i is divisible by 3 and 5.
 "Fizz" if i is divisible by 3.
 "Buzz" if i is divisible by 5.
 i (as a string) if none of the above conditions are true.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        ArrayList<String> FizzBuzzArray = new ArrayList<>();

        for (int i = 1; i <= myIntArray.length; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                FizzBuzzArray.add("FizzBuzz");
            } else if (i % 3 == 0) {
                FizzBuzzArray.add("Fizz");
            } else if (i % 5 == 0) {
                FizzBuzzArray.add("Buzz");
            } else {
                FizzBuzzArray.add(String.valueOf(i)); 
            }
        }
        System.out.println(FizzBuzzArray);
    }
}
