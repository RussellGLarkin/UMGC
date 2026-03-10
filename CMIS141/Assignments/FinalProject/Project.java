/*
Write a Java program which displays a menu to allow user the following functionality:
1. Load employees’ data - prompts user for the number of employees to be loaded and then prompts for each employee name, id (5 digit number), and annual salary
2. Add new employee - prompts user for an employee data, name, id, and annual salary
3. Display all employees - displays each employee’s data to the console, one employee per line
4. Retrieve specific employee’s data - prompts user for the employee id and displays the corresponding employee’s data: id, name, and salary
5. Retrieve employees with salaries based on range - prompts user for the lowest and highest salary and displays all employees with salaries in that range. Display each employee on separate line with all information - name, id, and salary
6. Exit

Design and implementation notes:
o Each menu selection should be implemented as a separate method
o Employees’ data should be saved in arrays, you can allocate for maximum 100 elements
o After completion of each selection, program should display the menu again to allow user another selection until they select Exit

Russell Larkin
CMIS 141/6386
03/02/2021
*/

import java.util.*;

public class Project {
    static Scanner scan = new Scanner(System.in);

    // arrays to hold employee data
    static int totalEmployees = 0;
    static String[] empFName = new String[0];
    static String[] empLName = new String[0];
    static int[] empID = new int[0];
    static int[] empSalary = new int[0];

    // display main menu options
    static String mainMenu() {
        return "\n\tMENU\n1: Load employee's data\n2: Add new employee\n3: Display all employees\n4: Retrieve specific employee’s data\n5: Retrieve employees with salaries based on range\n6: Exit\n\nEnter your selection: ";
    }

    // add employees
    static void addEmployee() {
        System.out.print("\nEnter employee's FIRST name and LAST name separated by a space: ");
        String fullName = scan.nextLine();
        // If previous input was nextInt(), consume leftover newline
        if (fullName.isEmpty()) fullName = scan.nextLine();
        String[] names = fullName.trim().split("\\s+", 2);
        String firstName = names.length > 0 ? names[0] : "";
        String lastName = names.length > 1 ? names[1] : "";

        System.out.print("Enter the employee's 5 digit ID number: ");
        int id = scan.nextInt();
        System.out.print("Enter the employee's salary: ");
        int salary = scan.nextInt();

        empFName = Arrays.copyOf(empFName, empFName.length + 1);
        empLName = Arrays.copyOf(empLName, empLName.length + 1);
        empID = Arrays.copyOf(empID, empID.length + 1);
        empSalary = Arrays.copyOf(empSalary, empSalary.length + 1);

        empFName[totalEmployees] = firstName;
        empLName[totalEmployees] = lastName;
        empID[totalEmployees] = id;
        empSalary[totalEmployees] = salary;

        totalEmployees++;
    }

    // print all employees
    static void printEmployee() {
        System.out.println("\nNAME\t\tID\tSALARY");
        for (int i = 0; i < totalEmployees; i++) {
            System.out.println(empFName[i] + " " + empLName[i] + "\t" + empID[i] + "\t" + empSalary[i]);
        }
    }

    // find a specific employee by ID
    static void findEmployee() {
        System.out.print("Enter the employee's 5 digit ID number: ");
        int findID = scan.nextInt();
        System.out.println("\nID\tNAME\t\tSALARY");
        boolean found = false;
        for (int i = 0; i < totalEmployees; i++) {
            if (empID[i] == findID) {
                System.out.println(empID[i] + "\t" + empFName[i] + " " + empLName[i] + "\t" + empSalary[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employee not found.");
        }
    }

    // find employees within a salary range
    static void findRange() {
        System.out.print("Enter the salary range separated by a space: ");
        int minRange = scan.nextInt();
        int maxRange = scan.nextInt();
        System.out.println("\nNAME\t\tID\tSALARY");
        boolean found = false;
        for (int i = 0; i < totalEmployees; i++) {
            if (empSalary[i] >= minRange && empSalary[i] <= maxRange) {
                System.out.println(empFName[i] + " " + empLName[i] + "\t" + empID[i] + "\t" + empSalary[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No employees found in that salary range.");
        }
    }

    public static void main(String[] args) {
        String menu = mainMenu();
        int selection;
        do {
            System.out.print(menu);
            selection = scan.nextInt();
            switch (selection) {
                case 1:
                    System.out.print("How many employees would you like to enter?: ");
                    int numEmployees = scan.nextInt();
                    for (int i = 0; i < numEmployees; i++) {
                        addEmployee();
                    }
                    break;
                case 2:
                    addEmployee();
                    break;
                case 3:
                    printEmployee();
                    break;
                case 4:
                    findEmployee();
                    break;
                case 5:
                    findRange();
                    break;
                case 6:
                    System.out.println("\nThank you for using my final program!\n");
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        } while (selection != 6);

        scan.close();
    }
}