public class IsMarksValid {
    public static boolean isMarkPercentage(double test1, double test2, double test3) {
        return (test1 <= 100 && test1 >= 0) && (test2 <= 100 && test2 >= 0) && (test3 <= 100 && test3 >= 0);
    }
}
