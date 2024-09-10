import java.util.*;

//sudokug generate hiihed ogogdson too davhardsang shalgana
public class isValid_sud {
    // Mor batalgaatai yu gej shalgana (davhardsan toonuud baihgui)
    public static int valid_row(int row, int[][] grid) {
        int temp[] = grid[row];
        Set<Integer> set = new HashSet<Integer>();
        for (int value : temp) {
            if (value < 0 || value > 9) {
                System.out.println("Invalid value");
                return -1;
            } else if (value != 0) {
                if (set.add(value) == false) {
                    return 0;
                }
            }
        }
        return 1;
    }

    // Bagana batalgaatai yu gejj shalgana (davhardsan toonuud baihgui)
    public static int valid_col(int col, int[][] grid) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 9; i++) {
            if (grid[i][col] < 0 || grid[i][col] > 9) {
                System.out.println("Invalid value");
                return -1;
            } else if (grid[i][col] != 0) {
                if (set.add(grid[i][col]) == false) {
                    return 0;
                }
            }
        }
        return 1;
    }

    // Dorvoljin dotorh dorvoljin 3x3 batalgaatai yu gej shalgana (davhardsan toonuud baihgui)
    public static int valid_subsquares(int[][] grid) {
        for (int row = 0; row < 9; row = row + 3) {
            for (int col = 0; col < 9; col = col + 3) {
                Set<Integer> set = new HashSet<Integer>();
                for (int r = row; r < row + 3; r++) {
                    for (int c = col; c < col + 3; c++) {
                        if (grid[r][c] < 0 || grid[r][c] > 9) {
                            System.out.println("Invalid value");
                            return -1;
                        } else if (grid[r][c] != 0) {
                            if (set.add(grid[r][c]) == false) {
                                return 0;
                            }
                        }
                    }
                }
            }
        }
        return 1;
    }

    // Sudoku sambar buhleeree batalgaatai yu gej shalgana.(davhardsan toonuud baihgui)
    public static Boolean valid_board(int[][] grid) {
        for (int i = 0; i < 9; i++) {
            int res1 = valid_row(i, grid);
            int res2 = valid_col(i, grid);
            if (res1 < 1 || res2 < 1) {
                return false;
            }
        }
        int res3 = valid_subsquares(grid);
        if (res3 < 1) {
            return false;
        } else {
            return true;
        }
    }

    // Sudoku sambariig hevlene
    public static void print_board(int[][] grid) {
        for (int[] row : grid) {
            System.out.print("[");
            for (int y : row) {
                System.out.print(y + ", ");
            }
            System.out.println("]");
        }
    }

    public static void main(String args[]) {
        // Batalgaatai sambar.
        int[][] board = {
                {3, 7, 4, 1, 6, 8, 2, 5, 9},
                {5, 1, 9, 4, 2, 7, 6, 8, 3},
                {2, 8, 6, 3, 9, 5, 7, 1, 4},
                {6, 9, 8, 5, 4, 1, 3, 7, 2},
                {1, 2, 3, 7, 8, 6, 9, 4, 5},
                {4, 5, 7, 9, 3, 2, 1, 6, 8},
                {9, 6, 2, 8, 7, 4, 5, 3, 1},
                {8, 3, 5, 6, 1, 9, 4, 2, 7},
                {7, 4, 1, 2, 5, 3, 8, 9, 6},
        };
        print_board(board);
        System.out.println(valid_board(board));

        // Batalgaagui sambar. Ehnii morond davtagdsan too baina.
        int[][] board2 = {
                {1, 4, 4, 0, 0, 0, 0, 0, 3},
                {2, 5, 0, 0, 0, 1, 0, 0, 0},
                {3, 0, 9, 0, 0, 0, 0, 0, 0},
                {0, 8, 0, 0, 2, 0, 0, 0, 4},
                {0, 0, 0, 4, 1, 0, 0, 2, 0},
                {9, 0, 0, 0, 0, 0, 6, 0, 0},
                {0, 0, 3, 0, 0, 0, 0, 0, 9},
                {4, 0, 0, 0, 0, 2, 0, 0, 0},
                {0, 0, 1, 0, 0, 8, 0, 0, 7},
        };
        print_board(board2);
        System.out.println(valid_board(board2));
    }
}
