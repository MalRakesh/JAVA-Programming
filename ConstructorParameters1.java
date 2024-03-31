public class ConstructorParameters1 {
    String MyName;
    int MyAge;

    // we can create as many parameters as we can
    public ConstructorParameters1(String name,int age){
        MyName = name;
        MyAge = age;
    }

    public static void main(String[] args) {
        System.out.println("*** JAVA Constructor Parameters ***");
        ConstructorParameters1 obj = new ConstructorParameters1("Rakesh", 21);
        System.out.println(obj.MyName + " is " + obj.MyAge + " yrs old.");

    }
}




