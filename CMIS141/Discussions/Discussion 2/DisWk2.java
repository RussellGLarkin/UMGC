import java.util.Scanner;

/* A program to calculate employee weekly salary

Russell Larkin
CMIS 141/6386
01/13/2021

*/

public class DisWk2 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // prompt user for the number of hours worked for that week and the weekly sales.
    System.out.println("\nHours worked this week: ");
    double hoursWorked = scan.nextDouble();
    
    System.out.println("Sales this week (ex. 10000.00): ");
    double weeklySales = scan.nextDouble();

    // pay rates
    double hourlyPay = 8.0; //$8 per hour
    double commission = 0.1; //10% commission

    // compute the total pay
    double totalPay = (hoursWorked * hourlyPay) + (weeklySales * commission);

    // display total pay
    System.out.print("Your total pay this week is: $" + totalPay);

    System.out.print("\n\n"); // line break for cleaner output

    scan.close();
    }
}