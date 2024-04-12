public class ModifyAttributes2 {
    // If we don't want the ability to override existing values, declare the attribute as final
    final int y = 2;

    public static void main(String[] args) {
        System.out.println("*** JAVA Modify Attributes Concept ***");
        ModifyAttributes2 obj3 = new ModifyAttributes2();
        // obj3.y = 99;     // occur an error: cannot assign a value to a final variable
        System.out.println(obj3.y);
    }
}
