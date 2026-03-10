/* A program to calculate the total drive time from Portland, OR to Anchorage, AK
based on average mph.

Russell Larkin
CMIS 141/6386
02/04/2021

*/

import java.util.Scanner;
public class DisWk4 {
    public static void main(String[] args) {
        final double totalDistance = 2434.1; // total distance Portland to Anchorage

        Scanner scan = new Scanner(System.in);

        // input speed in mph
        System.out.println("\nYou are driving from Portland, OR to Anchorage, AK!");
        System.out.println("The total distance is 2434.1 miles");
        System.out.print("How fast will you be driving on average in mph? (ex. 55): ");
        double speed = scan.nextDouble();
        
        // calculate total hours needed
        int totalHours = (int) Math.ceil(totalDistance / speed);
        int days = totalHours / 24;
        int hours = totalHours % 24;

        // output the total driving time
        System.out.println("\nThe total driving time will be approximately " + days + " day(s) and " + hours + " hour(s).\n");

        scan.close();
    }
}