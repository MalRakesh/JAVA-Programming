public class AccessMethodObject {
    // created Bike() method
    public void Bike(){
        System.out.println("The Kawasaki Ninja Bike is going as fast as it can!");
    }

    // Created Speed() method and added parameters
    public void Speed(int maxSpeed){
        System.out.println("Speed : " + maxSpeed + "kmph");
    }

    public static void main(String[] args) {
        System.out.println("*** JAVA Access Method with an Object Concept ***");
        // called the methods as myBike object
        AccessMethodObject myBike = new AccessMethodObject();
        myBike.Bike();
        myBike.Speed(323);
    }
}

