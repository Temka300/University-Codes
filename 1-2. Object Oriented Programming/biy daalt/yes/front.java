import java.util.Scanner;

//Terminal deer gargah
public class front {
    static Scanner sc = new Scanner(System.in);

    public static void main() {
        int c = Integer.parseInt("00");
        System.out.println(c);
    }

    // 2D array dotor baigaa sudoku sambariig hevlene
    public static void printboard(int[][] a, int sizee) {
        String num = "";
        for (int i = 0; i < sizee; i++) {
            for (int j = 0; j < sizee; j++) {
                // 0-iig '•' bolgono (hooson dorvoljing ilerhiilj baina)
                if (a[i][j] == 0) {
                    num = "•";
                } else {
                    num = a[i][j] + "";
                }
                // 2 bolon 5 toonuudiig ('|', ' ') baganaar huvaana
                System.out.print(((j == 2 || j == 5) ? (num + " | ") : (num + " ")));
            }
            // buh 3 dah morond ('-----') huvaana
            System.out.println((i == 2 || i == 5) ? ("\n---------------------") : (""));
        }
    }

    // string messej hevlene
    public static void print(String s) {
        System.out.println(s);
    }

    // Toglogchiin integer songoltiig unshina
    public static int choice(String prompt) {
        System.out.println(prompt);
        int ch = sc.nextInt();
        return ch;
    }

    // Toglogchiin string songoltiig unshina
    public static String choicestr(String prompt) {
        System.out.println(prompt);
        String ch = sc.next();
        return ch;
    }

    // Sudoku sambariig 2D massiviin stringeer iltgej buig hevlene
    public static void printboard(String[][] a, int sizee) {
        for (int i = 0; i < sizee; i++) {
            for (int j = 0; j < sizee; j++) {
                // 2 bolon 5 toonuudiig ('|', ' ') baganaar huvaana
                System.out.print(((j == 2 || j == 5) ? (a[i][j] + " | ") : (a[i][j] + " ")));
            }
            // buh 3 dah morond ('-----') huvaana
            System.out.println((i == 2 || i == 5) ? ("\n------------------------------") : (""));
        }
    }
}
