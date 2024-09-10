import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Arrays;

//saved.txt filiig unshij, tusdan bolgoh zai ogch 2D massiv sudoku sambart oruul
public class reader {
    static int[][] board = new int[9][9]; // Sudoku sambariig hadgalah 2D massiv

    public static void main() throws FileNotFoundException {
        File file = new File("saved.txt"); // file buteene
        Scanner scan = new Scanner(file); // file-iig unshih scanner buteene
        String curr_line = "";
        String[] splited = {};
        int i = 0;

        while (scan.hasNextLine()) {
            curr_line = scan.nextLine(); // file dotorh moriig unshine
            
            // moriig zaitai huvaagaad elementuudiig int bolgono 
            // Split the line by spaces and convert each element to an integer
            board[i] = Arrays.stream(curr_line.split(" ")).mapToInt(Integer::parseInt).toArray();
            i++;
        }
    }

    public static int[][] sendboard() {
        return board; // Sudoku sambariig butsaana
    }
}
