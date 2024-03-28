public class MultipleObject {
    int x = 36;
    // Here, Single has Multiple Object 
    public static void main(String[] args) {
        System.out.println("*** JAVA Multiple Objects ***");
        MultipleObject obj1 = new MultipleObject();
        MultipleObject obj2 = new MultipleObject();
        MultipleObject obj3 = new MultipleObject();
        System.out.println(obj1.x);
        System.out.println(obj2.x);
        System.out.println(obj3.x);
        
    }
}




