//What is the output produced by the following Java code ?
public class WhatIsOutput {
    public static void main(String[] args) {
        
    int term = 4;
    int total = 0;
    int i = 0;
        while (i < 30) {
            if (i % term == 0)
                total += i;
            i++;
        }
        System.out.println(total);
        System.out.println("Sum 0f number which divide 30 by 4 with no remainder: " + (4 + 8 + 12 + 16 + 20 + 24 + 28));
    }
}