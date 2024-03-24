public class CallMethod {
    // myMethod() is the name of the method
    // static means that the method belongs to the Main class and not an object of the Main class.
    // void means that this method does not have a return value.
    static void myMethod(){
        System.out.println("Hey This is the myMethod()");
    }
    public static void main(String[] args) {
        System.out.println("*** Call a Method ***");
        myMethod();
    }
}




