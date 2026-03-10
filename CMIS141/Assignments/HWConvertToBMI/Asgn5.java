/* 
(1) Prompt the user which action they want to take:
    (a) Convert pounds into kilograms
    (b) Convert height in inches to centimeters
    (c) Calculate BMI display category
    (d) Exit program
(2) Programs at minimum must have the following methods:
    (a) Convert weight method gets pounds and returns kilograms
    (b) Convert to height method that gets height in inches and returns meters
    (c) Calculate BMI method that gets weight in kilograms and height in meters and returns BMI value
(3) For each action the user should be prompted for corresponding data and given the appropriate output
(4) User should be able to select one action and then get prompted again for selection until they select exit choice

Russell Larkin
CMIS 141/6386
02/15/2021
*/
import java.util.Scanner;
public class Asgn5 {

    // method to display menu options
    static String mainMenu() {
        return "\tMENU\n1: Convert pounds into kilograms\n2: Convert height in inches to centimeters\n3: Calculate BMI using weight in kilograms and display category\n9: Exit program\n\nEnter your selection: ";
    }

    // method to convert lbs into kg
    public static double lbsKilo(double lbs) {
        double kg = lbs * .45;
        return kg;  
    }

    // method to convert inches into cm
    public static double inchCent(double inches) {
        double cm = inches * 2.54;
        return cm;
    }

    // method to calculate bmi using kg and cm
    public static double totalBMI(double kg, double cm) {
        double bmi = kg / cm / cm * 10000;
        return bmi;
    }

    public static String bmiCategory(double bmi) {
        if (bmi <= 18.5) {
            return "Underweight";
        } else if (bmi <= 24.99) {
            return "Normal";
        } else if (bmi <= 29.99) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    // main method to run the program
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print(mainMenu());
            int selection = scan.nextInt();

            if (selection == 1) {
                System.out.print("\nEnter weight in pounds: ");
                double lbs = scan.nextDouble();
                double kg = lbsKilo(lbs);
                System.out.println(lbs + " lbs = " + kg + " kg\n\n");
            } else if (selection == 2) {
                System.out.print("\nEnter height in inches: ");
                double inches = scan.nextDouble();
                double cm = inchCent(inches);
                System.out.println(inches + " inches = " + cm + " cm\n\n");
            } else if (selection == 3) {
                System.out.print("\nEnter weight in kg and height in centimeters separated by space: ");
                double kg = scan.nextDouble();
                double cm = scan.nextDouble();
                double bmiValue = totalBMI(kg, cm);
                String category = bmiCategory(bmiValue);
                System.out.println("BMI = " + bmiValue + " Category = " + category + "\n\n");
            } else if (selection == 9) {
                System.out.println("Thank you for using the program. Goodbye!\n");
                break;
            } else {
                System.out.println("Invalid selection. Please try again.\n");
            }
        }
        scan.close();
    }
}