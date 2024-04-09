public class loop3 {
    public static void main(String[] args) {
        System.out.println("*** Java Nested Loop ***");
        // The "inner loop" will be executed one time for each iteration of the "outer loop"
        for(int i=1;i<=2;i++){
            System.out.println("Parent: " + (i));

        for(int j=1;j<=3;j++){
            System.out.println("Child: "+(j));
        }
        }
    }
}