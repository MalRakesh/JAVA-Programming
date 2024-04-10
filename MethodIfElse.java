public class MethodIfElse {
    static void myAge(int age ){
        if (age >=18){
            System.out.println("You Can Vote.");
        }
        else{
            System.out.println("You Cannot Vote.");
        }
    }
    public static void main(String[] args) {
        System.out.println("*** JAVA Method with If Else Concept ***");
        myAge(21);
    }
}
