/* 
(1) Prompts a user to enter student id, current class grade in GPA format (e.g. 3.5), current class number of credits, overall GPA, and overall number of credits (use Scanner for input).
(2) Calculates student’s new overall GPA
(3) Displays the input data along with new GPA to the console

Russell Larkin
CMIS 141/6386
01/13/2021

*/
import java.util.Scanner; 
public class Asg1 { 
    public static void main(String[] args) { 
    Scanner scan = new Scanner(System.in); 
    
    System.out.println("\nInput student ID: "); 
    String myID = scan.nextLine();  

    System.out.println("Input current class grade in GPA format (ex. 3.0): "); 
    float myGPA = scan.nextFloat(); 
    
    System.out.println("Input current class number of credits: "); 
    float myCredits = scan.nextFloat(); 
    
    System.out.println("Input overall GPA (ex. 4.0): "); 
    float overallGPA = scan.nextFloat(); 
    
    System.out.println("Input overall number of credits: ");
    float overallCredits = scan.nextFloat();

    float newGPA = ((myGPA * myCredits) + (overallGPA * overallCredits)) / (myCredits + overallCredits);

    System.out.println("\nSTUDENT DATA:");
    System.out.println ("\nID: " + myID);
    System.out.println ("Class GPA: " + myGPA);
    System.out.println ("Class credits: " + myCredits);
    System.out.println ("Overall GPA: " + overallGPA);
    System.out.println ("Overall credits: " + overallCredits);
    System.out.printf("\nNew GPA = %.2f\n", newGPA);
    System.out.print("\n\n");

        scan.close();
    } 
}