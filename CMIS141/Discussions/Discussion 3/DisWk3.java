import java.util.Scanner;
public class DisWk3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // input how long you've been sitting at your desk
        System.out.print("\nHow many minutes have you been sitting at your desk? (ex. 35): ");
        int sit = scan.nextInt();

        // recommend the user to stand up if they have been sitting for too long
        System.out.println("\nExperts recommend sitting 20 minutes out of every half hour at work,");
        System.out.println("standing for eight minutes and moving around for at least two minutes.\n");
        if (sit <= 19) {
            int standup = 20 - sit;
            System.out.println("You need to stand up in " + standup + " minutes.\n");}
        else {
            System.out.println("Stand up and stretch those legs!\n");}

        scan.close();
    }
}
