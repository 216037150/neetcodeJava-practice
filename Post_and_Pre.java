public class Post_and_Pre {
    public static void main(String[] args) {
        String name = "Siyabonga";
        System.out.println("Character at index 3");
        char na = name.charAt(3);
        System.out.println(na);

        System.out.println();
        System.out.println("Post");
        for (int a = 0; a < name.length(); ++a) {
            System.out.println(a);
        }
        System.out.println();
        System.out.println("Pre");

        for (int a = 0; a < name.length(); a++) {
            int result = a;
            System.out.println(result);
        }
    }
}
