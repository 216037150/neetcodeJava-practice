//Give the output of the following Java code ? Explain your answer.
public class Swap{
    public static void main(String[] args) {
        int a = 4;
        int b = 9;

        swapVariable(a, b);
        System.out.println("a = " + a + " and b = " + b);
    }

// method swap
public static void swapVariable (int a, int b) {
a = a + b;
b = a - b;
a = a - b;
return;
    }
}