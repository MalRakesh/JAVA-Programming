public class Halting {
    // Using recursion to add all of the numbers between 5 to 10
    
    public static void main(String[] args) {
        System.out.println("*** JAVA Halting Condition Concept ***");
        int result = sum(5,10);
        System.out.println(result);
    }

    static int sum(int start, int end){
        if (start < end){
            return end + sum(start,end-1);
        }
        else{
            return end ;
        }
    }

}
