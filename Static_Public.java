public class Static_Public {
    // Static Method()
    static void StaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }

    // Public Method()
    public void PublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        System.out.println("*** JAVA Static vs Public Methods ***");
        StaticMethod();
        Static_Public obj1 = new Static_Public();
        obj1.PublicMethod();
    }
}







