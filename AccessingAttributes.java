public class AccessingAttributes {
    int a = 15;
    // a is the attribute
    // obj1 is the object
    // . is used to access the object in the class  ->   obj1.a
    public static void main(String[] args) {
        System.out.println("*** JAVA Accessing Attributes Concept ***");
        AccessingAttributes obj1 = new AccessingAttributes();
        System.out.println(obj1.a);
    }
}
