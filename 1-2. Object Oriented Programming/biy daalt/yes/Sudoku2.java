import java.util.Random;

public class Sudoku2 {
    public static void main(String[] args) {
        int rows = 9;
        int columns = 9;

        int[][] matrix = new int[rows][columns];
        Random random = new Random();

        System.out.println("Generating random values for the sudoku");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int randomNumber = random.nextInt(9) + 1; 
                matrix[i][j] = randomNumber;
            }
        }

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
