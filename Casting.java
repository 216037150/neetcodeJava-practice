public class Casting {
    public static void main(String[] args) {
        /*
        Primitive Data Types
        byte	Stores whole numbers from -128 to 127
        short	Stores whole numbers from -32,768 to 32,767
        int	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double	Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
        boolean	Stores true or false values
        char

        byte<short<int<long<float<double


        //Non-Primitive Data Types
       strings, arrays, and classes

        */
        int a = 436;
        byte b = 45;
        b = (byte) a;
        System.out.println(b);
    }
}
