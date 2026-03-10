package Assignment2;

import java.util.Scanner;

public class OrderSystem {
    private static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        while (true) {
            System.out.println("MENU\n1: Order a Snack\n2: Exit program");
            System.out.print("Enter your selection: ");
            int orderASnack = scan.nextInt();

            if (orderASnack == 2) {
                System.out.println("Thank you for using the program. Goodbye!");
                break;
            } else if (orderASnack == 1) {
                System.out.print("Do you want Fruit Snack (1) or Salty Snack (2): ");
                int fruitOrSalty = scan.nextInt();
                String idString = String.valueOf(fruitOrSalty);

                System.out.print("What size do you want: S, M, or L: ");
                String size = scan.next().toUpperCase();
                idString += size;

                if (fruitOrSalty == 1) {
                    System.out.print("Do you want citrus fruit included? true/false: ");
                    boolean citrusFruit = scan.nextBoolean();
                    idString += citrusFruit ? "T" : "F";
                    Snack newSnack = new FruitSnack(idString, size, citrusFruit);
                    System.out.println(newSnack);
                } else if (fruitOrSalty == 2) {
                    System.out.print("Do you want a nut snack included? true/false: ");
                    boolean nutSnack = scan.nextBoolean();
                    idString += nutSnack ? "T" : "F";
                    Snack newSnack = new SaltySnack(idString, size, nutSnack);
                    System.out.println(newSnack);
                }
            }
        }
        scan.close();
    }
}