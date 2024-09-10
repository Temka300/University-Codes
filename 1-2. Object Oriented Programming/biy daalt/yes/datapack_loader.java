import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

// ene ni file aas datag avch huvisagchind hiideg class
public class datapack_loader {
    // Variables to store the loaded values
    // huviagchind value ogoh
    static int easy_num = 0;
    static int mid_num = 0;
    static int high_num = 0;
    static int mid_tries = 0;

    public static void main() throws FileNotFoundException {
        File file = new File(".datapack\\datapack.txt"); // zaasan gazr file object buteene 
        Scanner scan = new Scanner(file); // File-iig unshih scanner buteene
        String curr_line = "";

        while (scan.hasNextLine()) {
            curr_line = scan.nextLine(); // file-aas moriig ni unshina

            if (curr_line.equals("---")) { // hervee morond "---" baival loopnees garna
                break;
            }

            if (curr_line.contains("easy_num")) { // hervee morond "easy_num" baival
                easy_num = Integer.parseInt(curr_line.substring(11)); // integer-iig ni avna 
                if (easy_num >= 81 || easy_num < 0) { // Value ni 81 ees ih, 0 ees baga bol gej shalgana
                    easy_num = 0; // Bish bol, default value-nd baina
                }
            }

            if (curr_line.contains("mid_num")) { // Hervee morond "mid_num" baival
                mid_num = Integer.parseInt(curr_line.substring(10)); // integer-iig ni avna 
                if (mid_num >= 81 || mid_num < 0) { // Value ni 81 ees ih, 0 ees baga bol gej shalgana
                    mid_num = 0; // Bish bol, default value-nd baina
                }
            }

            if (curr_line.contains("high_num")) { // Hervee morond "high_num" baival
                high_num = Integer.parseInt(curr_line.substring(11)); // integer-iig ni avna 
                if (high_num >= 81 || high_num < 0) { // Value ni 81 ees ih, 0 ees baga bol gej shalgana
                    high_num = 0; // Bish bol, default value-nd baina
                }
            }

            if (curr_line.contains("mid_tries")) { // Hervee morond "mid_tries" baival
                mid_tries = Integer.parseInt(curr_line.substring(12)); // integer-iig ni avna 
                if (mid_tries < -1) { // Value ni -1 ees baga bol gej shalgana
                    mid_tries = -1; // Bish bol, default value-nd baina
                }
            }
        }

        // Printing the loaded values (commented out)
        // System.out.println(easy_num + " " + mid_num + " " + high_num + " " + mid_tries);
    }

    public static int val(int ch) {
        // ogogdsonn index-ees value-g butsaana
        // Return the value based on the provided index
        switch (ch) {
            case 0:
                return easy_num;
            case 1:
                return mid_num;
            case 2:
                return high_num;
            case 3:
                return mid_tries;
            default:
                return 0;
        }
    }
}
