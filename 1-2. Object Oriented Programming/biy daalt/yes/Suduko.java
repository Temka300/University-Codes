//Sudokunii durmiig dagan too bichhed davhardsang shalgana
public class Suduko {

    static int N = 9; // N Sudokunii hemjee (N*N) is the size of the Sudoku grid (N*N)

    // backtracking ashiglaad sudoku tailna
    static boolean solveSuduko(int grid[][], int row, int col) {
        // Suuliinn bagana morond hurehed, amjillttai taasan gej true-g butsaana
        // If we have reached the last row and column, return true to indicate a successful solution
        if (row == N - 1 && col == N) {
            return true;
        }
        
        // Hervee odoogiin bagana-ii value 9 bolhod, daraagiin morond ochij baganiig 0 ees ehlene
        // If the current column value becomes 9, move to the next row and start from column 0
        if (col == N) {
            row++;
            col = 0;
        }
        
        // Hervee odoogiin grid nii bairlal 0-ees ih value bol
        // daraagiin bagana luu shiljine
        if (grid[row][col] != 0) {
            return solveSuduko(grid, row, col + 1);
        }

        // odoogiin bairlald 1-ees 9 hurtel buh dugaariig uzne
        for (int num = 1; num < 10; num++) {
            // ogogdson mor bolon baganad 1-ees 9 too tavihad zugeer uu gej shalgana
            if (isSafe(grid, row, col, num)) {
                // odoogiin bairlald too ogno
                grid[row][col] = num;
                
                // recursiveer daraagiin bagana-ii bolomjiig shalgana
                if (solveSuduko(grid, row, col + 1)) {
                    return true;
                }
            }

            // hervee buruu bikvikm ogson toog ustgaad daraagiinhiig tosoolno
            grid[row][col] = 0;
        }

        return false;
    }

    // Dorvoljin dotorh ogogdson bagana bolon morond too tavih zugeer uug shalgana
    static boolean isSafe(int[][] grid, int row, int col, int num) {
        
        // Ijilhen morond too bainuu gej shalgana
        for (int x = 0; x <= 8; x++) {
            if (grid[row][x] == num) {
                return false;
            }
        }

        // Ijilhen baganad too bainuu gej shalgana
        for (int x = 0; x <= 8; x++) {
            if (grid[x][col] == num) {
                return false;
            }
        }

        // Toog 3x3 dorvoljind baigaag shalgana
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i + startRow][j + startCol] == num) {
                    return false;
                }
            }
        }

        return true;
    }
}
