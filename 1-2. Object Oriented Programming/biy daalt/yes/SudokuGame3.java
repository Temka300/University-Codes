import java.util.Scanner;
import java.util.Random;

public class SudokuGame3 {
    private static final int GRID_SIZE = 9;
    private static final int SUBGRID_SIZE = 3;

    private static int[][] grid = new int[GRID_SIZE][GRID_SIZE];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Sudoku!");

        initializeGrid();

        while (!isGridFull() || !isSolutionCorrect()) {
            printGrid();

            System.out.print("Enter row (1-9): ");
            int row = scanner.nextInt();

            System.out.print("Enter column (1-9): ");
            int col = scanner.nextInt();

            System.out.print("Enter value (1-9): ");
            int value = scanner.nextInt();

            if (isValidMove(row - 1, col - 1, value)) {
                grid[row - 1][col - 1] = value;
                System.out.println("Move accepted.");
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        printGrid();
        System.out.println("Congratulations! You solved the Sudoku puzzle.");
    }
    
    //  private static void initializeGrid() {
    //    for (int i = 0; i < GRID_SIZE; i++) {
     //       for (int j = 0; j < GRID_SIZE; j++) {
    //           grid[i][j] = 0;
    //        }
    //    }
    //}
    
    private static void initializeGrid() {
        Random random = new Random();

        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                int randomNumber = random.nextInt(9) + 1;
                grid[i][j] = randomNumber;
            }
        }
    }


    private static void printGrid() {
        System.out.println("+-----+-----+-----+");

        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                if (j % SUBGRID_SIZE == 0) {
                    System.out.print("| ");
                }

                System.out.print(grid[i][j] + " ");
            }

            System.out.println("|");

            if ((i + 1) % SUBGRID_SIZE == 0) {
                System.out.println("+-----+-----+-----+");
            }
        }
    }

    private static boolean isValidMove(int row, int col, int value) {
        if (value < 1 || value > 9 || grid[row][col] != 0) {
            return false;
        }

        for (int i = 0; i < GRID_SIZE; i++) {
            if (grid[row][i] == value || grid[i][col] == value) {
                return false;
            }
        }

        int subgridRow = row - row % SUBGRID_SIZE;
        int subgridCol = col - col % SUBGRID_SIZE;

        for (int i = subgridRow; i < subgridRow + SUBGRID_SIZE; i++) {
            for (int j = subgridCol; j < subgridCol + SUBGRID_SIZE; j++) {
                if (grid[i][j] == value) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isGridFull() {
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                if (grid[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isSolutionCorrect() {
        return true;
    }
}
