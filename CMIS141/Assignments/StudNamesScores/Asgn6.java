/*
Write a Java program as follows:
1. Prompt user for the number of students
2. For each student have user enter student’s name and exam score (0-100)
3. Store names and scores in separate arrays
4. Code method which gets integer array and uses for-loop to find the index of the smallest value
5. Code method which gets integer array and uses for-loop to find the index of the largest value
6. Output all students with their scores
7. Output which student has highest exam score and which student has lowest exam score

Russell Larkin
CMIS 141/6386
02/18/2021
*/
import java.util.Scanner;

public class Asgn6 {
    
    // method to find index of the largest value
    public static int getMax(int[] studScores) {
        int maxAt = 0;
        for (int i = 0 ; i < studScores.length ; i++){
            if(studScores[i] > studScores[maxAt]) {
                maxAt = i;
            }
        }
        return maxAt;
    }

    // method to find index of the smallest value
    public static int getMin(int[] studScores) {
        int minAt = 0;
        for (int i = 1; i < studScores.length; i++) {
            if (studScores[i] < studScores[minAt]) {
                minAt = i;
            }
        }
        return minAt;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nHow many students do you want to enter : ");
        int numStudent = scan.nextInt();
        scan.nextLine();

        String studNames[] = new String[numStudent];
        int studScores[] = new int[numStudent];

        for (int i = 0; i < numStudent; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.print("\tEnter student's name : ");
            String studentName = scan.nextLine();
            System.out.print("\tEnter student's score (0-100): ");
            int studentScore = scan.nextInt();
            scan.nextLine();

            studNames[i] = studentName;
            studScores[i] = studentScore;
        }

        // for loop to print out names and grades in order they were entered
        System.out.println("\n");
        for (int i = 0 ; i < numStudent ; i++) {
            System.out.print(studNames[i]);
            System.out.println( "\t" + studScores[i] );
        }

        // print out highest and lowest grades based on the index number that the methods getMax and getMin return
        System.out.println("");
        System.out.print(studNames[getMax(studScores)] + " has the highest score => " + studScores[getMax(studScores)] + " and ");
        System.out.println(studNames[getMin(studScores)] + " has the lowest score => " + studScores[getMin(studScores)] + "\n");

    // close scanner
    scan.close();
    }
}