package SkillsPw.Others;

import java.util.Scanner;
// WITH TIME COMPLEXITY = O(l);
public class PrintAny {
    public static final String RESET = "\u001B[0m";
    public static final String BRIGHTBLUE = "\u001B[94m";
    public static final String BOLD = "\u001B[1m";
    public static final String WHITEBACKGROUND = "\u001B[47m";
    public static final String BRIGHTGREEN = "\u001B[92m";
    public static final String BRIGHTYELLOW = "\u001B[93m";
    public static final String BRIGHTRED = "\u001B[91m";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print( BRIGHTBLUE + BOLD +  WHITEBACKGROUND +  "ENTER THE THING YOU WANT TO DISPLAY : " + RESET + WHITEBACKGROUND + BOLD + BRIGHTRED );
        String s = sc.nextLine();
        s = s.toUpperCase();
        System.out.println("   ");
        giveLetter(s);
        System.out.println();
    }
    public static void giveLetter(String s){
        int l = s.length();
        int j = 0;
        for(int i = 0;i<=l;i++){
            if (i == l) {
                printWord(s.substring(j, l)); 
                return;
            }
            if (s.charAt(i) == (char)32) {
                System.out.println();
                printWord(s.substring(j, i));
                System.out.println();
                j = i + 1;
            }
        }
    }
    public static void printWord(String s){
        int rows = 5; // Fixed number of rows for each letter pattern

        // Iterate over columns (width of the letters, assuming a max width of 5)
        for (int row = 0; row < rows; row++){
            for (char letter : s.toCharArray()) {
                printLetterRow(letter, row);
                System.out.print("   ");  // Space between letters in output
            }
            System.out.println();    // Move to next row after each column iteration
        }
    }

    public static void printLetterRow(char letter, int row) {
        switch (letter) {

            // FOR CHARACTERS

            case 'A': printA(row); break;
            case 'B': printB(row); break;
            case 'C': printC(row); break;
            case 'D': printD(row); break;
            case 'E': printE(row); break;
            case 'F': printF(row); break;
            case 'G': printG(row); break;
            case 'H': printH(row); break;
            case 'I': printI(row); break;
            case 'J': printJ(row); break;
            case 'K': printK(row); break;
            case 'L': printL(row); break;
            case 'M': printM(row); break;
            case 'N': printN(row); break;
            case 'O': printO(row); break;
            case 'P': printP(row); break;
            case 'Q': printQ(row); break;
            case 'R': printR(row); break;
            case 'S': printS(row); break;
            case 'T': printT(row); break;
            case 'U': printU(row); break;
            case 'V': printV(row); break;
            case 'W': printW(row); break;
            case 'X': printX(row); break;
            case 'Y': printY(row); break;
            case 'Z': printZ(row); break;

            // FOR NUMBERS

            case '0': print0(row); break;
            case '1': print1(row); break;
            case '2': print2(row); break;
            case '3': print3(row); break;
            case '4': print4(row); break;
            case '5': print5(row); break;
            case '6': print6(row); break;
            case '7': print7(row); break;
            case '8': print8(row); break;
            case '9': print9(row); break;
        }
    }

    // Pattern functions for each letter from A to Z

    public static void printA(int row) {
        if (row == 0) System.out.print(" *** ");
        else if (row == 1) System.out.print("*   *");
        else if (row == 2) System.out.print("*****");
        else System.out.print("*   *");
    }

    public static void printB(int row) {
        if (row == 0 || row == 2 || row == 4) System.out.print("**** ");
        else System.out.print("*   *");
    }

    public static void printC(int row) {
        if (row == 0 || row == 4) System.out.print(" ****");
        else System.out.print("*    ");
    }

    public static void printD(int row) {
        if (row == 0 || row == 4) System.out.print("**** ");
        else System.out.print("*   *");
    }

    public static void printE(int row) {
        if (row == 0 || row == 2 || row == 4) System.out.print("*****");
        else System.out.print("*    ");
    }

    public static void printF(int row) {
        if (row == 0 || row == 2) System.out.print("*****");
        else System.out.print("*    ");
    }

    public static void printG(int row) {
        if (row == 0) System.out.print(" ****");
        else if (row == 2) System.out.print("*  **");
        else if (row == 4) System.out.print(" ****");
        else System.out.print("*    ");
    }

    public static void printH(int row) {
        if (row == 2) System.out.print("*****");
        else System.out.print("*   *");
    }

    public static void printI(int row) {
        if (row == 0 || row == 4) System.out.print("*****");
        else System.out.print("  *  ");
    }

    public static void printJ(int row) {
        if (row == 0) System.out.print("*****");
        else if (row == 4) System.out.print("**** ");
        else System.out.print("   * ");
    }

    public static void printK(int row) {
        if (row == 0 || row == 4) System.out.print("*   *");
        else if (row == 1) System.out.print("*  * ");
        else System.out.print("* *  ");
    }

    public static void printL(int row) {
        if (row < 4) System.out.print("*    ");
        else System.out.print("*****");
    }

    public static void printM(int row) {
        if (row == 0) System.out.print("*   *");
        else if (row == 1) System.out.print("** **");
        else System.out.print("*   *");
    }

    public static void printN(int row) {
        if (row == 1) System.out.print("**  *");
        else if (row == 2) System.out.print("* * *");
        else System.out.print("*   *");
    }

    public static void printO(int row) {
        if (row == 0 || row == 4) System.out.print(" *** ");
        else System.out.print("*   *");
    }

    public static void printP(int row) {
        if (row == 0 || row == 2) System.out.print("**** ");
        else if (row == 1) System.out.print("*   *");
        else System.out.print("*    ");
    }

    public static void printQ(int row) {
        if (row == 0 || row == 4) System.out.print(" *** ");
        else if (row == 3) System.out.print("*  **");
        else System.out.print("*   *");
    }

    public static void printR(int row) {
        if (row == 0 || row == 2) System.out.print("**** ");
        else if (row == 1) System.out.print("*   *");
        else if (row == 3) System.out.print("* *  ");
        else System.out.print("*   *");
    }

    public static void printS(int row) {
        if (row == 0 || row == 2 || row == 4) System.out.print(" ****");
        else if (row == 1) System.out.print("*    ");
        else System.out.print("    *");
    }

    public static void printT(int row) {
        if (row == 0) System.out.print("*****");
        else System.out.print("  *  ");
    }

    public static void printU(int row) {
        if (row < 4) System.out.print("*   *");
        else System.out.print(" *** ");
    }

    public static void printV(int row) {
        if (row < 3) System.out.print("*   *");
        else if (row == 3) System.out.print(" * * ");
        else System.out.print("  *  ");
    }

    public static void printW(int row) {
        if (row < 3) System.out.print("*   *");
        else if (row == 3) System.out.print("* * *");
        else System.out.print(" * * ");
    }

    public static void printX(int row) {
        if (row == 0 || row == 4) System.out.print("*   *");
        else if (row == 2) System.out.print(" *** ");
        else System.out.print(" * * ");
    }

    public static void printY(int row) {
        if (row < 2) System.out.print("*   *");
        else if (row == 2) System.out.print(" *** ");
        else System.out.print("  *  ");
    }

    public static void printZ(int row) {
        if (row == 0 || row == 4) System.out.print("*****");
        else if (row == 1) System.out.print("   * ");
        else if (row == 2) System.out.print("  *  ");
        else System.out.print(" *   ");
    }

    // PATTERN FUNCTION FOR NUMBERS 0 TO 9

    public static void print0(int row) {
        if (row == 0 || row == 4) System.out.print(" *** ");
        else System.out.print("*   *");
    }

    public static void print1(int row) {
        if (row == 0) System.out.print("  *  ");
        else if (row < 4) System.out.print("  *  ");
        else System.out.print("*****");
    }

    public static void print2(int row) {
        if (row == 0 || row == 2 || row == 4) System.out.print("*****");
        else if (row == 1) System.out.print("    *");
        else System.out.print("*    ");
    }

    public static void print3(int row) {
        if (row == 0 || row == 2 || row == 4) System.out.print("*****");
        else System.out.print("    *");
    }

    public static void print4(int row) {
        if (row < 3) System.out.print("*   *");
        else if (row == 3) System.out.print("*****");
        else System.out.print("    *");
    }

    public static void print5(int row) {
        if (row == 0 || row == 2 || row == 4) System.out.print("*****");
        else if (row == 1) System.out.print("*    ");
        else System.out.print("    *");
    }

    public static void print6(int row) {
        if (row == 0 || row == 2 || row == 4) System.out.print("*****");
        else if (row == 1) System.out.print("*    ");
        else System.out.print("*   *");
    }

    public static void print7(int row) {
        if (row == 0) System.out.print("*****");
        else System.out.print("    *");
    }

    public static void print8(int row) {
        if (row == 0 || row == 2 || row == 4) System.out.print("*****");
        else System.out.print("*   *");
    }

    public static void print9(int row) {
        if (row == 0 || row == 2 || row == 4) System.out.print("*****");
        else if (row == 1) System.out.print("*   *");
        else System.out.print("    *");
    }
}
