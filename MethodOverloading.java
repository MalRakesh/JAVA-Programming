public class MethodOverloading {
    // Method overloading is a multiple methods can have the same name with different parameters
    static int myMethodInt(int x,int y){
        return x + y;
    }
    static double myMethodDouble(double x,double y){
        return x + y;
    }
    public static void main(String[] args) {
        System.out.println("*** JAVA Method Overloading Concept ***");
        int num1 = myMethodInt(14,61);
        double num2 = myMethodDouble(4.3, 6.2 );
        System.out.println("Int : " + num1);
        System.out.println("Double : " + num2);
    }
}
