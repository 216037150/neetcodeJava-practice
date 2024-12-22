// Give the output of the following Java code ?
public class Quest32 {

    public static void main(String[] args) {
        boolean Found = false;
        int i = 10;
        if (!(i < 5 || !Found))
            System.out.println("Statement 1");
        else if ((i > 5 && !Found))
            System.out.println("Statement 2");
        else if (!(i > 5 || !Found))
            System.out.println("Statement 3");
        else if (((i > 5) && !Found))
            System.out.println("Statement 4");
    }
}
