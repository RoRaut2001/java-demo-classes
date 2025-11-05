public class MultidimensionalArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4,5};// single dimensional array
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] jaggedArray = {
                {1},
                {2,3},
                {3,5,6},
                {2,3}
        };

        String[][] nameMatrix = {
                {"Rohini", "Sakshi","Diksha"},
                {"Rohini", "Sakshi","Diksha"},
        };

        for(int i= 0; i < nameMatrix.length; i++){
            for (int j=0; j < matrix[i].length; j++){
                System.out.print(nameMatrix[i][j] + " ");
            }
            System.out.println();
        }

        for(int i= 0; i< matrix.length ; i++ ){
           for(int j = 0; j < matrix[i].length; j++){
               System.out.print(matrix[i][j] + " ");
           }
            System.out.println();
        }


        // calculate length of array===== arrayName.length
        for (int number : numbers) { ///  enhanced for loop
            System.out.println(number);
        }
    }
}
