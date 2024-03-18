public class Reply {
    public static void main(String[] args) {
        System.out.println("*** Difference Between & and && Operators ***");
        int a = 5;
        int b = 9;

        // & is an Bitwise Operator it tells us about manipulation of individual bits of a number
        System.out.println("a & b = "+(a&b));

        // && is an Logical Operator it is tells us about True or False Statement
        System.out.println("The Value of a > b = "+(a < b && b>a));
    }
}



