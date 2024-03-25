public class ReturnValues1 {
    // This example returns the sum of two parameters
    static int myMethod(int x,int y){
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println("*** JAVA Return Value Concept ***");
        System.out.println(myMethod(4, 6));
        int z = myMethod(7, 4);
        System.out.println(z);
    }
}



