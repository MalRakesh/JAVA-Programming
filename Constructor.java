public class Constructor {
    int a;

    // created constructor
    public Constructor(){
        a = 23;
    }
    
    public static void main(String[] args) {
        System.out.println("*** JAVA Constructor Concept ***");
    //Create an object of class Main (This will call the constructor)
        Constructor obj1 = new Constructor();  
        System.out.println(obj1.a);
    }
}





