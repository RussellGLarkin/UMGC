/* 
Using nested for-loops this program asks once for the number of rows and then completes the following:
(1) outputs the triangle pattern based on the number of rows input.
(2) outputs the diamond pattern based on the number of rows input.

Russell Larkin
CMIS 141/6386
02/11/2021
*/
import java.util.Scanner;
public class Asgn4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pound; // number of #
        int space; // number of spaces
        int rows; // number of rows

        // prompt user for number of rows
        System.out.print("Input the number of rows (eg 6): ");
        rows = scan.nextInt(); 

        // output triangle pattern
        for (space = 1; space <= rows; space++) {
            for (pound = 1; pound <= space; pound++) {
                System.out.printf("# ");
            }
            System.out.println("");
        }

        // output top of diamond
        for (space = 0; space <= rows; space++){
            for (pound = 1; pound <= rows - space; pound++) {
                System.out.print("  ");
            }
            for (pound = 1; pound <= space * 2 - 1; pound++) {
                System.out.print("# ");
            }
                System.out.println("");
            }

        // output bottom of diamond
        for (space = rows - 1; space >= 1; space--) {
            for (pound = 1; pound <= rows - space; pound++) {
                System.out.print("  ");
            }
            for (pound = 1; pound <= space * 2 - 1; pound++) {
                System.out.print("# ");
            }
                System.out.println("");
        } 
        scan.close();
    }
}