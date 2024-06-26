public class Recursion {
    // Recursion is the technique of making a function call itself.
    // Use recursion to add all of the numbers up to 10
    public static void main(String[] args) {
        System.out.println("*** JAVA Recursion Concept ***");
        int result = sum(10);
        System.out.println(result);
    }

    public static int sum(int k){
        if (k > 0){
            return k + sum(k-1);
        }
        else{
            return 0;
        }
    }
}





