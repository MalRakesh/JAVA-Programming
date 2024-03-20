public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("*** JAVA Break and Continue in While Loop Concept ***");
        // we can also use break and continue in while loops
        int i = 0;
        while (i < 10) {
            if(i == 5){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}


