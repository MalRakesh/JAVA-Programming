public class MultidimensionalArray {
    public static void main(String[] args) {
        System.out.println("*** JAVA Multi-Dimensional Array ***");
        // Multidimensional Array is an Array of Arrays.
        // It is useful when we want to store data as a tabular form, like a table with rows and columns.
        // Array indexes start with 0: [0] is the first element
        int[][] num = {{1,2,3,4,5},{6,12,18,14,24},{10,20,30,40,50}};
        System.out.println(num[0][1]); 
        System.out.println(num[1][3]); 
        System.out.println(num[2][4]); 
    }
}
