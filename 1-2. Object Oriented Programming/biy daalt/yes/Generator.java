import java.util.Random;
import java.util.Arrays;

//Sudoku buteegch
public class Generator {
    public static int[][] generate(int no) {
        // Hooson sudoku-g Template uzuulj baina
        int[][] template = {{0, 0, 0, 0, 0, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0, 0, 0, 0, 0},
                           {0, 0, 0, 0, 0, 0, 0, 0, 0}};
                           
        int[][] a = new int[9][9]; // Template sambarnii huulbar
        int[][] b = new int[9][9]; // Ogson kodong ashiglagdaagui
        
        copy_arr(template, a); // 'a' dotor template huulna
        addval(a, no); //  'a' dotor value oruulna
        
        isValid_sud isValid = new isValid_sud(); // Sudoku sambariig batalgaatai yu geh object
        
        while (true) {
            if (isValid.valid_board(a)) { // Sambar batalgaatai yu
                break; // Batalgaatai uyd, loopnees garah
            } else {
                copy_arr(template, a); // Sambariig template luu butsaah
                addval(a, no); // Sambart value oruulna
            }
        }
        
        return a; // Uusgesen boardiig hevlene
    }
    
    public static void addval(int[][] a, int no) {
        Random rand = new Random(); // Random number generator
        Boolean apply = false;
        int delay = 0;
        int uses = no; // Number of values to add
        
        while (uses > 0) {
            delay = rand.nextInt(6) + 3; // 3 bolon 8-t second delay ogno
            apply = false;
            
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[1].length; j++) {
                    if (delay != 0) {
                        delay -= 1; // 0 bish bol delay hasna 
                    } else {
                        if (a[i][j] == 0) { // Hervee 1x1 nuh 0 bol
                            apply = rand.nextBoolean(); // sanamsarguigeer value oruulna
                            if (apply && uses > 0) { // Hervee nemeh esvel value nemhed uldsen bol
                                a[i][j] = rand.nextInt(9) + 1; // 1-ees 9 hoorond sanamsarguigeer value-d oruulna
                                delay = rand.nextInt(6) + 2; // Shinehen delay 2-oos 9 hoorond neene
                                uses -= 1; // value nemeh dugaaruudiig hasna
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static void copy_arr(int[][] a, int[][] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[1].length; j++) {
                b[i][j] = a[i][j]; // Copy each value from 'a' to 'b'
            }
        }
    }
}
