public class ConstructorParameters {
    int x;

    public ConstructorParameters(int y){
        x = y;
    }

    public static void main(String[] args) {
        System.out.println("*** JAVA Constructor Parameters Concept ***");
        ConstructorParameters obj1 = new ConstructorParameters(76);
        System.out.println(obj1.x);
    }
}
