public class MultidimensionalArray2 {
    public static void main(String[] args) {
        System.out.println("*** JAVA Multi-Dimensional Array ***");
        // For Loop in a Multi-Dimensional Array
        int[][] num = {{1,2,3,4,5},{6,12,18,24,30}};
        for (int i = 0; i < num.length ;++i){
            for (int j = 0; j < num[i].length ; ++j){
                System.out.println(num[i][j]);
            }
        }
    }
}



