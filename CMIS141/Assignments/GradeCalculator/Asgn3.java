/* 
(1) Prompt and read user’s input for the student’s name, assignment 1 grade (A1), assignment 2 grade (A2), exam grade (EX), and participation grade (P). User Scanner to read input.
(2) Each grade input should be 0-100 and the final grade should be calculated as follows: A1*0.25+A2*0.25+EX*0.4+P*0.1
(3) Output the student’s information and the calculated course grade
(4) prompt user whether they want to calculate grade for another student and repeat the input/output processing
(5) Allow user to exit program without inputting student’s data

Russell Larkin
CMIS 141/6386
01/25/2021
*/

import java.util.Scanner;

public class Asgn3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nWelcome to the grade calculation program");

        // loop to allow multiple student grade calculations
        while (true) {
            System.out.print("Do you want to enter a student's data? Yes/No => ");
            String response = scan.next().trim().toLowerCase();
            if (response.startsWith("n")) {
                break;
            }

            System.out.print("Enter the student's first name: ");
            String firstName = scan.next();

            System.out.print("Enter the student's last name: ");
            String lastName = scan.next();

            System.out.print("Enter grades separated by space (A1 A2 EX P): ");
            int a1 = scan.nextInt();
            int a2 = scan.nextInt();
            int ex = scan.nextInt();
            int p = scan.nextInt();

            double finalGrade = a1 * 0.25 + a2 * 0.25 + ex * 0.4 + p * 0.1;

            System.out.printf("\nStudent Name: %s %s\nA1=%d A2=%d Exam=%d Participation=%d\nFinal course grade = %.2f\n\n",
                    firstName, lastName, a1, a2, ex, p, finalGrade);
        }

        System.out.println("\nThank you for using the grade calculation program\n");
        scan.close();
    }
}