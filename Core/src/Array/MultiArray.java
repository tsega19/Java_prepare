package Array;

/**
 * multidimensional ARRAY
 */
public class MultiArray {
    public static void main(String[] args) {
        int[][] matrix1;
        matrix1 = new int[3][4];
        System.out.println(matrix1);
//        having an array value

        int[][] matrix2 = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
//        System.out.println(matrix2[2][2]);
//        System.out.println(matrix2.length);
//        iterating for loop
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("------------------------------------------");
        System.out.println();
        for (int[] row : matrix2) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
