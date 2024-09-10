import java.io.FileWriter;
import java.io.IOException;

// sudoku sambariig saved.txtt fileruu oruul
public class writerr {
    static String fin = ""; // Sudoku sambart suuliin string iltgeh
    static int[][] board = new int[9][9]; // Sudoku sambariig hadgalah

    // Method to set the Sudoku board
    // sudoku-nii sambariig tavina
    public static void ent_val(int[][] b) {
        board = b; // ogogdson sudoku sambariig huvisagchind ogoh
    }
    
    //sudoku sambariig filend bichne
    public static void write() {
        try (FileWriter fileWriter = new FileWriter("saved.txt", false)) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (j == 8) {
                        fin = fin + String.valueOf(board[i][j]); // // valueg suuliin stringd nemne (suuliin bagana)
                    } else {
                        fin = fin + String.valueOf(board[i][j]) + " "; // final stringd value nemne (suuliin bagana bish)
                    }
                }
                fileWriter.write(fin + "\r\n"); // buh moriig filend bichij, line break dagan bichne
                fin = ""; // Reset the final string for the next row
// daraagiin morond final string huuchin baidald oruulna
            }
        } catch (IOException e) {
            // exception
        }
    }
}
