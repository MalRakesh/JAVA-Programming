public class Switch {
    public static void main(String[] args) {
        System.out.println("*** Switch Statement In JAVA ***");
        int days = 7;
        switch (days) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            // default keyword is used if there is no case match
            default:
                System.out.println("It is not in the days");
        }
    }
}



