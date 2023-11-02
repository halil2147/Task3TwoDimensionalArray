public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];
        int sumDiagonal = 0;


        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                if (row == col) {

                    matrix[row][col] = row;
                    sumDiagonal += row;
                } else {

                    matrix[row][col] = 0;
                }
            }
        }

        System.out.println("Matrix:");
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println("Sum of diagonal elements: " + sumDiagonal);
    }
}
