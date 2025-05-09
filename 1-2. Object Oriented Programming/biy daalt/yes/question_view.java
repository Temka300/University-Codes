// Sudoku-nii interface boloh ba togloomtoi interact hiine 
public class question_view {
    static Generator gen = new Generator(); // Sudoku sambariig buteeh generator object
    public static final datapack_loader mod = new datapack_loader(); // data unshuulah datapack-loader
    static Boolean hasModLoaded = false; // mod suulgagdsan uu shalgah

    private static void loadMod() {
        try {
            mod.main(); // datapack_loader-oos mod duudah arga
            hasModLoaded = true; // mod unshsan iltgeh
        } catch (Exception e) {
            // mod unshad garah exceptioniig argalna
        }
    }

    static isValid_sud isValid = new isValid_sud(); // isValid_sud object-oor sudoku sambar batalgaatai yug shalgah
    static main m = new main(); // main method oruulah main object
    static int tries = 0; // heden udaa oroldson be
    static int tried_mistakes = 0; // Heden udaa aldaa gargasan be
    static int modes = 0; // Game mode (0: easy, 1: medium, 2: hard)
    static solver_view sol = new solver_view(); // solver_view object-oor sudoku shalgah
    static int def_easy = 0; // Default value for easy mode
    static int def_mid = 0; // Default value for medium mode
    static int def_high = 0; // Default value for hard mode

    public static void loadval() {
        if (hasModLoaded) {
            def_easy = mod.val(0); // Load the value for easy mode from the mod
            def_mid = mod.val(1); // Load the value for medium mode from the mod
            def_high = mod.val(2); // Load the value for hard mode from the mod
            tries = mod.val(3); // Load the number of tries from the mod
        }
        // Set default values if the mod values are not available
        if (def_easy == 0) {
            def_easy = 20;
        }
        if (def_mid == 0) {
            def_mid = 15;
        }
        if (def_high == 0) {
            def_high = 8;
        }
        if (tries == 0) {
            tries = 5;
        }
    }

    /*
     * 3 modes : 
     * 
     * easy[0] : 20 toog ogch, aldaag butsaana
     * medium[1] : 15 toog ogch, aldaag butsaana
     * hard[2] :  8 toog ogno
     */
    static front f = new front(); // user interface
    static int[] unused = { 9, 19, 29, 39, 49, 59, 69, 79, 89 }; // Ashiglagdaagui toog hadgalah massiv
    static int[] locked_num = new int[unused.length]; // tugjigdsen toog hadgalah massiv
    static String[][] template = { { "00", "01", "02", "03", "04", "05", "06", "07", "08" },
        { "10", "11", "12", "13", "14", "15", "16", "17", "18" }, { "20", "21", "22", "23", "24", "25", "26", "27", "28" },
        { "30", "31", "32", "33", "34", "35", "36", "37", "38" }, { "40", "41", "42", "43", "44", "45", "46", "47", "48" },
        { "50", "51", "52", "53", "54", "55", "56", "57", "58" }, { "60", "61", "62", "63", "64", "65", "66", "67", "68" },
        { "70", "71", "72", "73", "74", "75", "76", "77", "78" }, { "80", "81", "82", "83", "84", "85", "86", "87", "88" } };

    // sudoku ehluuleh main
    public static void main() {
        System.out.print('\u000C');
        loadMod();
        loadval();
        System.out.println((hasModLoaded) ? "A mod has been loaded in" : "No mods loaded");
        f.print("");
        askmode();
        int rnd = 0;
        switch (modes) {
            case 0:
                rnd = def_easy;
                break;
            case 1:
                rnd = def_mid;
                break;
            case 2:
                rnd = def_high;
                break;
        }
        int board[][] = gen.generate(rnd);
        int og[][] = new int[board.length][board[1].length];
        int board2[][] = new int[board.length][board[1].length];
        copy_arr(unused, locked_num);
        copy_arr(board, og);
        lock_nos(board);
        paint(board, board2, og, template, "");
    }
    
    // Sudoku sambariig gargah ba toglogchiinn inputiig harna
    public static void paint(int[][] board, int[][] board2, int[][] og, String[][] template, String message) {
        System.out.print('\u000C');
        String display = "";
        String ch = "";
        int c = 0;
        int row = 0;
        int col = 0;
        int size = board.length;
        f.print("            SUDOKU BOARD\n____________________________________");
        f.print("");
        f.print(message);
        f.print("");
        f.printboard(board, size);
        f.print("");
        f.print("");
        f.printboard(template, size);
        f.print("");
        f.print("");
        
        //Davhaltiig ashiglan toglogchiin ugiig harj, sudoku sambariig shinechlene
        while (true) {
            ch = f.choicestr("Update Field ? \nType 111 for restart and 222 for a new board, type 333 to solve the board, 444 to return back to the main screen");
            if (ch.length() > 1) {
                c = Integer.parseInt(ch);
                if (c == 111) {
                    copy_arr(og, board);
                    paint(board, board2, og, template, "");
                } else if (c == 222) {
                    main();
                } else if (c == 444) {
                    m.main();
                } else if (c == 333) {
                    sol.submit(og);
                } else if (c <= 88 && c >= 0) {
                    if (!c_exist(c)) {
                        break;
                    }
                }
            }
        }

        row = (ch.charAt(0) - '0');
        col = (ch.charAt(1) - '0');

        while (true) {
            c = f.choice("New Value ?");
            if (c > 9 || c < 1) {
                continue;
            } else {
                if (modes == 0) {
                    copy_arr(board, board2); // backup on board2
                    board[row][col] = c;
                    if (isValid.valid_board(board)) {
                        if (wincheck(board) == 1) {
                            winloss(1);
                            break;
                        }
                        paint(board, board2, og, template, "");
                    } else {
                        copy_arr(board2, board); // butsaana
                        paint(board, board2, og, template, "Invalid value or Wrong choice!!");
                    }
                } else if (modes == 1) {
                    if (tried_mistakes < tries || tries == -1) {
                        copy_arr(board, board2); // backup on board2
                        board[row][col] = c;
                        if (isValid.valid_board(board)) {
                            if (wincheck(board) == 1) {
                                winloss(1);
                                break;
                            }
                            paint(board, board2, og, template, "");
                        } else {
                            copy_arr(board2, board); // butsaana
                            tried_mistakes++;
                            String temp = (tries != -1) ? "Invalid value or Wrong choice!!\nTries left: " + (tries - tried_mistakes) : "Invalid value or Wrong choice!!";
                            paint(board, board2, og, template, temp);
                        }
                    } else {
                        board[row][col] = c;
                    }
                } else {
                    board[row][col] = c;
                }

                if (wincheck(board) == 1) {
                    winloss(1);
                    break;
                } else if (wincheck(board) == -1) {
                    winloss(-1);
                    break;
                } else {
                    paint(board, board2, og, template, "");
                }
            }
        }
    }
    
    // Valueg locked_num massiv dotor bainuug shalgah functs
    public static Boolean c_exist(int c) {
        for (int i = 0; i < locked_num.length; i++) {
            if (c != locked_num[i]) {
            
            } else if (c == locked_num[i]) {
                return true;
            }
        }
        return false;
    }

    // neg massivaas nogoo massiv luu huulah functs
    public static void copy_arr(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
    }

    // 2D massiviig nogoo luu huulah functs
    public static void copy_arr(int[][] a, int[][] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[1].length; j++) {
                b[i][j] = a[i][j];
            }   
        }
    }

    // sudoku sambariig tugjih functs
    public static void lock_nos(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[1].length; j++) {
                if (board[i][j] != 0) {
                    int pos = Integer.parseInt(i + "" + j);
                    locked_num = add_arr(locked_num, pos);
                }
            }
        }
    }
    
    // elementiig massiv luu oruulah functs
    public static int[] add_arr(int[] arr, int no) {
        int[] arr2 = new int[arr.length + 1];
        copy_arr(arr, arr2);
        arr2[arr.length] = no;
        return arr2;
    }
    
    // toglogchoos ali game mode luu oroh veg asuuh functs
    public static void askmode() {
        int c = f.choice("Choose your game mode : \n1.Easy\n2.Medium\n3.Hard");
        switch (c) {
            case 1:
                modes = 0;
                break;
    
            case 2:
                modes = 1;
                break;
    
            case 3:
                modes = 2;
                break;
    
            default:
                f.print("Invalid mode, retry");
                f.print("");
                askmode();
                break;
        }
    }
    
    // sudoku sambariig shalgah functs (complete, valid, or invalid)
    public static int wincheck(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[1].length; j++) {
                if (board[i][j] == 0) {
                    return 0;
                }
            }
        }
        if (isValid.valid_board(board)) {
            return 1;
        }
        return -1; // 0 - not complete, 1 - good, -1 - bad
    }
    
    // togloomiin hariultiig haruulah functs (win or loss)
    public static void winloss(int status) {
        System.out.print('\u000C');
        f.print("");
        if (status == 1) {
            f.print("GG, YOU WON");
        } else {
            f.print("YOU LOST :(");
        }
        f.print("");
        m.main_screen();
    }
}