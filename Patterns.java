public class Patterns {
    public static void main(String[] args) {
        System.out.println("*** Patterns In JAVA Using Nested For Loop ***");

        int i, j;
        for (i = 0; i <= 5; i++) {
            for (j = i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (j = 6; j >= 0; j--) {
            for (i = 0; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
