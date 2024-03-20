public class ContinueConcept {

    public static void main(String[] args) {
        System.out.println("*** JAVA Continue Concept ***");
        // Continue statement breaks one loop if a specified condition occurs, and continues with the next loop.
        for(int i = 0; i < 10; i++){
            if(i==4){
                continue;
            }
            System.out.println(i);
        }
    }
}



