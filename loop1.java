public class loop1 {
    public static void main(String[] args) {
        System.out.println("*** JAVA Do/While Loop ***");
        // Do/While loop will always be executed at least once, even if the condition is false, because the code block is executed before the condition is tested
        int i = 0;
        do{
            System.out.println(i);
            i++;
        }
        while(i<5);
    }
}



