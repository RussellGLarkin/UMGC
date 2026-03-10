/* 
(1) Prompts a user to enter two numbers and symbol for operation such as '+', '-', '*', and '/' (use Scanner for input). 
(1) Prompts a user to enter two numbers and symbol for operation such as ‘+’, ‘-‘, ‘*’, and ‘/’ (use Scanner for input).
(2) Code uses nested if statement or switch to perform the operation on the two numbers
(3) If the provided symbol is valid, displays the input data along with the result of the calculation to the console. Otherwise displays error message

Russell Larkin
CMIS 141/6386
01/25/2021
*/
import java.util.Scanner;
public class Asgn2 {
    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in); 

        // input two integers and a symbol for operations
        System.out.print("\nEnter two integer numbers seperated by a space (ex. 7 6): "); 
        double num1 = scanner.nextDouble(); 
        double num2 = scanner.nextDouble();

        System.out.print("Enter operation symbol (+, -, *, or /): "); 
        char op = scanner.next().charAt(0);

        // create output displays
        String evaluation = "Evaluation: ";
        switch (op) {
            case '+' : System.out.println(evaluation + num1 + " " + op + " " + num2 + " = " + (num1 + num2));
                break;
            case '-' : System.out.println(evaluation + num1 + " " + op + " " + num2 + " = " + (num1 - num2));
                break;
            case '*' : System.out.println(evaluation + num1 + " " + op + " " + num2 + " = " + (num1 * num2));
                break;
            case '/' : 
                if (num2 != 0) {
                    System.out.println(evaluation + num1 + " " + op + " " + num2 + " = " + (num1 / num2));
                } else {
                    System.out.println("\nError: Division by zero is not allowed.");
                }
                break;
            default : 
                System.out.println("\nNot valid operational symbol");
        };

        System.out.print("\n"); // line break for cleaner output

        scanner.close();
        }   
}